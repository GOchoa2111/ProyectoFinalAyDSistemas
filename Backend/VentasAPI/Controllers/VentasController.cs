using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using VentasAPI.Data;
using VentasAPI.Models;

namespace VentasAPI.Controllers
{
    [ApiController]
    [Route("api/[controller]")]
    public class VentasController : ControllerBase
    {
        private readonly VentasDbContext _context;
        public VentasController(VentasDbContext context) => _context = context;

        [HttpGet]
        public async Task<ActionResult<IEnumerable<Venta>>> Get() =>
            await _context.Ventas.ToListAsync();

        [HttpGet("{id}")]
        public async Task<ActionResult<Venta>> Get(int id)
        {
            var venta = await _context.Ventas.FindAsync(id);
            return venta == null ? NotFound() : venta;
        }

        [HttpPost]
        public async Task<ActionResult<Venta>> Post(Venta venta)
        {
            _context.Ventas.Add(venta);
            await _context.SaveChangesAsync();
            return CreatedAtAction(nameof(Get), new { id = venta.Id }, venta);
        }

        [HttpPut("{id}")]
        public async Task<IActionResult> Put(int id, Venta venta)
        {
            if (id != venta.Id) return BadRequest();
            _context.Entry(venta).State = EntityState.Modified;
            await _context.SaveChangesAsync();
            return NoContent();
        }

        [HttpDelete("{id}")]
        public async Task<IActionResult> Delete(int id)
        {
            var venta = await _context.Ventas.FindAsync(id);
            if (venta == null) return NotFound();
            _context.Ventas.Remove(venta);
            await _context.SaveChangesAsync();
            return NoContent();
        }
    }
}

