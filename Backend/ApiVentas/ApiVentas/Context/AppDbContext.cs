using ApiVentas.Modelos;
using Microsoft.EntityFrameworkCore;

namespace ApiVentas.Context
{
    public class AppDbContext: DbContext
    {
        public AppDbContext(DbContextOptions<AppDbContext> options) : base(options) { }
        public DbSet<Producto> Productos { get; set; }
    }
}
