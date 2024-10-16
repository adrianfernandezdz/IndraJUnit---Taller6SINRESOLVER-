package Taller6.ArgumentCaptor1.tests;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import Taller6.ArgumentCaptor1.models.Pedido;
import Taller6.ArgumentCaptor1.services.EmailService;
import Taller6.ArgumentCaptor1.services.HistorialPedidosService;
import Taller6.ArgumentCaptor1.services.LoggingService;
import Taller6.ArgumentCaptor1.services.PedidoService;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import java.util.List;

public class PedidoServiceTest {


    // Instanciar servicio y mocker dependencias.




    //Este test testeará un pedido con descuento procesado correctamente y:
    //1. Verificará que s eha llamado a enviarEmail(), y capturará los argumentos usados, y los comprobará con unos asserts.
    //2. Verificará el número de veces que se ha llamado al loginService.registrarEvento, capturará el argumento cada vez (1 por vez)
    // y los comprobará con unos asserts.
    //3. Verificará que se ha llamado a actualizar historial, se capturarán sus argumentos y los comprobará con unos asserts.
    @Test
    public void testProcesarPedido_conDescuentoYHistorialExitoso() throws Exception {
        // Preparar el pedido y el cliente

        // Procesar el pedido para un cliente VIP

        // 1. Capturar los argumentos para el método enviarEmail

        // 2. Capturar los eventos registrados en loggingService

        // 3. Capturar los argumentos para el método actualizarHistorial
    }

    //Este test testeará un pedido con error en el historial
    //1. Se validará que se lanza una excepción al actualizar Historial.
    //2. Se capturará el el argumento para registrarError y se validarará.
    //3. Se verificará que nunca se llamó exitosamente a registrarEvento con ... "Historial actualizado para cliente ..."
    @Test
    public void testProcesarPedido_conErrorEnHistorial() throws Exception {
        // Preparar el pedido y el cliente problemático

        // Simular excepción cuando se actualiza el historial

        // Procesar el pedido

        // Capturar el evento de error registrado;

        // Validar que no se registró el mensaje de historial actualizado
    }

    //Este test testeará un pedido sin descuento procesado correctamente y:
    //1. Verificará que s eha llamado a enviarEmail(), y capturará los argumentos usados, y los comprobará con unos asserts.
    //2. Verificará el número de veces que se ha llamado al loginService.registrarEvento, capturará el argumento cada vez (1 por vez)
    // y los comprobará con unos asserts.
    @Test
    public void testProcesarPedido_sinDescuento() throws Exception {
        // Preparar el pedido y el cliente

        // Procesar el pedido para un cliente normal

        // Verificar que no se aplicó descuento

        // Capturar los eventos de logging
    }


    // Este test validará múltiples pedidos
    //1. verificaremos cuántas veces se llama a enviarEmail, Capturaremos los argumentos de todas las veces, y los validaremos.
    //2. verificaremos cuántas veces se llama a registrarEvento, Capturaremos los argumentos de todas las veces, y los validaremos.
    @Test
    public void testProcesarMultiplesPedidos() throws Exception {
        // Preparar pedidos y cliente

        // Procesar dos pedidos


        // Capturar los correos electrónicos enviados


        // Verificar los logs
    }


    // Este test validará un pedido vacio
    //1. Verificaremos los argumentos del email
    //2. Veriricaremos los argumentos del registrarEvento.
    @Test
    public void testProcesarPedido_vacio() throws Exception {
        // Preparar un pedido vacío

        // Procesar el pedido vacío

        // Verificar que el total es 0

        // Verificar logs
    }


    //Este test testeará un pedido con error al mandar el email
    //1. Se validará la excepción lanzada al enviarEmail
    //2. Se capturará y verificará el mensaje utilizado en registrarError
    @Test
    public void testErrorEnEnvioDeEmail() throws Exception {
        // Preparar pedido y cliente


        // Simular excepción en el envío de email


        // Procesar el pedido
;

        // Verificar que se capturó el error en los logs
    }
}
