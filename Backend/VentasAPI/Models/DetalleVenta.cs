namespace VentasAPI.Models
{
    public class DetalleVenta
    {
        public int Id { get; set; }
        public int Id_Venta { get; set; }
        public int Id_Producto { get; set; }
        public int Cantidad { get; set; }
        public decimal Precio_Unitario { get; set; }
    }
}