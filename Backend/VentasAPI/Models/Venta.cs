namespace VentasAPI.Models
{
    public class Venta
    {
        public int Id { get; set; }
        public DateTime Fecha { get; set; }
        public int Id_Usuario { get; set; }
        public int Id_Cliente { get; set; }
        public decimal Total { get; set; }
    }
}