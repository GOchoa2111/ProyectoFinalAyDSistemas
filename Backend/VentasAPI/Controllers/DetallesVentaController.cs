using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using VentasAPI.Data;
using VentasAPI.Models;

namespace VentasAPI.Controllers
{
    [ApiController]
    [Route("api/[controller]")]
    public class DetallesVentaController : ControllerBase
    {
        private readonly VentasDbContext _context;
        public DetallesVentaController(VentasDbContext context) => _context = context;

        [HttpGet]
        public async Task<ActionResult<IEnumerable<DetalleVenta>>> Get() =>
            await _context.DetalleVentas.ToListAsync();

        [HttpGet("{id}")]
        public async Task<ActionResult<DetalleVenta>> Get(int id)
        {
            var detalle = await _context.DetalleVentas.FindAsync(id);
            return detalle == null ? NotFound() : detalle;
        }

        [HttpPost]
        public async Task<ActionResult<DetalleVenta>> Post(DetalleVenta detalle)
        {
            _context.DetalleVentas.Add(detalle);
            await _context.SaveChangesAsync();
            return CreatedAtAction(nameof(Get), new { id = detalle.Id }, detalle);
        }

        [HttpPut("{id}")]
        public async Task<IActionResult> Put(int id, DetalleVenta detalle)
        {
            if (id != detalle.Id) return BadRequest();
            _context.Entry(detalle).State = EntityState.Modified;
            await _context.SaveChangesAsync();
            return NoContent();
        }

        [HttpDelete("{id}")]
        public async Task<IActionResult> Delete(int id)
        {
            var detalle = await _context.DetalleVentas.FindAsync(id);
            if (detalle == null) return NotFound();
            _context.DetalleVentas.Remove(detalle);
            await _context.SaveChangesAsync();
            return NoContent();
        }
    }
}
