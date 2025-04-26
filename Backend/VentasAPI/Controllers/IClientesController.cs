using Microsoft.AspNetCore.Mvc;
using VentasAPI.Models;

namespace VentasAPI.Controllers
{
    public interface IClientesController
    {
        Task<ActionResult<IEnumerable<Cliente>>> Get();
        Task<ActionResult<Cliente>> Get(int id);
        Task<ActionResult<Cliente>> Post(Cliente cliente);
        Task<IActionResult> Put(int id, Cliente cliente);
    }
}