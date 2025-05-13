using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using SistemaVentas.Data;
using SistemaVentas.Models;

namespace SistemaVentas.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class DetalleVentasController : ControllerBase
    {
        private readonly SistemaVentasContext _context;

        public DetalleVentasController(SistemaVentasContext context)
        {
            _context = context;
        }

        [HttpGet]
        public async Task<ActionResult<IEnumerable<DetalleVenta>>> GetDetalleVentas()
        {
            return await _context.DetalleVentas.ToListAsync();
        }

        [HttpGet("{id}")]
        public async Task<ActionResult<DetalleVenta>> GetDetalleVenta(int id)
        {
            var detalle = await _context.DetalleVentas.FindAsync(id);
            if (detalle == null)
                return NotFound();
            return detalle;
        }

        [HttpPost]
        public async Task<ActionResult<DetalleVenta>> PostDetalleVenta(DetalleVenta detalle)
        {
            _context.DetalleVentas.Add(detalle);
            await _context.SaveChangesAsync();
            return CreatedAtAction(nameof(GetDetalleVenta), new { id = detalle.Id }, detalle);
        }

        [HttpPut("{id}")]
        public async Task<IActionResult> PutDetalleVenta(int id, DetalleVenta detalle)
        {
            if (id != detalle.Id)
                return BadRequest();

            _context.Entry(detalle).State = EntityState.Modified;
            await _context.SaveChangesAsync();
            return NoContent();
        }

        [HttpDelete("{id}")]
        public async Task<IActionResult> DeleteDetalleVenta(int id)
        {
            var detalle = await _context.DetalleVentas.FindAsync(id);
            if (detalle == null)
                return NotFound();

            _context.DetalleVentas.Remove(detalle);
            await _context.SaveChangesAsync();
            return NoContent();
        }
    }
}
