using Microsoft.AspNetCore.Mvc;
using SistemaVentas.Models;
using SistemaVentas.Services;

namespace SistemaVentas.Controllers
{
    [ApiController]
    [Route("api/[controller]")]
    public class AuthController : ControllerBase
    {
        private readonly JwtService _jwtService;

        public AuthController(JwtService jwtService)
        {
            _jwtService = jwtService;
        }

        [HttpPost("login")]
        public IActionResult Login([FromBody] UserLogin request)
        {
            if (request.Username == "admin" && request.Password == "1234")
            {
                var user = new UserModel
                {
                    Username = request.Username,
                    Role = "Administrador"
                };

                var token = _jwtService.GenerateToken(user);
                return Ok(new { token });
            }

            return Unauthorized("Credenciales inválidas");
        }
    }
}