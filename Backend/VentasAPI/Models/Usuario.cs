namespace VentasAPI.Models
{
    public class Usuario
    {
        public required int IdUsuario { get; set; }
        public required string Nombre { get; set; }
        public required string Correo { get; set; }
        public required string Contraseña { get; set; }
        public required string Rol { get; set; }
        public int Id { get; set; }
    }
}