package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MercadoLibrePage;

import java.nio.file.Paths;

public class MercadoLibreSteps {

    WebDriver driver;
    MercadoLibrePage mercadoLibrePage;

    @Given("Se ingresa a incio de MercadoLibre")
    public void seIngresaAIncioDeMercadoLibre() throws InterruptedException {
        String driverPath = Paths.get("src", "test", "resources", "drivers", "chromedriver.exe").toAbsolutePath().toString();
        System.setProperty("webdriver.chrome.driver", driverPath);

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        mercadoLibrePage = new MercadoLibrePage(driver);
        mercadoLibrePage.navigateTo("https://www.mercadolibre.cl");
        Thread.sleep(5000);
    }

    @When("Presiono sobre el menu desplegable Categorias")
    public void presiono_sobre_el_menu_desplegable_categorias() {
        mercadoLibrePage.presionarBotonCategorias();
    }
    @And("Presiono sobre la categoria Construccion")
    public void presiono_sobre_la_categoria_construccion() {
        mercadoLibrePage.presionarBotonConstruccion();
    }
    @And("Presiono sobre Ver mas")
    public void presiono_sobre_ver_mas() {
        mercadoLibrePage.presionarBotonVerMas();
    }
    @And("Presiono sobre Mobiliario para Baños")
    public void presiono_sobre_mobiliario_para_baños() {
        mercadoLibrePage.presionarBotonMobilarioParaBanos();
    }
    @And("Presiono sobre Griferia para Baño")
    public void presiono_sobre_griferia_para_baño() {
        mercadoLibrePage.presionarBotonGriferiaParaBano();
    }
    @Then("Valido el titulo Griferia para Baño")
    public void valido_el_titulo_griferia_para_baño() {
        Assert.assertEquals(mercadoLibrePage.obtenerTituloGiferiaParaBano(),"Grifería para Baño");
        driver.quit();
    }

    @And("Presiono sobre la categoria Tecnologia")
    public void presiono_sobre_la_categoria_tecnologia() {
        mercadoLibrePage.presionarBotonTecnologia();
    }
    @And("Presiono sobre accesorios para celulares")
    public void presiono_sobre_accesorios_para_celulares() {
        mercadoLibrePage.presionarBotonAccesoriosParaCelulares();
    }

    @Then("valido el titulo Celulares y Telefonia")
    public void valido_el_titulo_celulares_y_telefonia() {
        Assert.assertEquals(mercadoLibrePage.obtenerTituloCelularesYTelefonia(),"Celulares y Telefonía");
    }

    @Then("valido el titulo Accesorios para Celulares")
    public void valido_el_titulo_accesorios_para_celulares() {
        Assert.assertEquals(mercadoLibrePage.obtenerTituloAccesoriosParaCelulares(),"Accesorios para Celulares");
        driver.quit();
    }

    @When("Presiono sobre la categoria Ofertas")
    public void presiono_sobre_la_categoria_ofertas() {
        mercadoLibrePage.presionarBotonOfertas();
    }
    @And("Presiono sobre Ofertas del dia")
    public void presiono_sobre_ofertas_del_dia() {
        mercadoLibrePage.presionarBotonOfertasDelDia();
    }
    @Then("valido el titulo Ofertas del dia")
    public void valido_el_titulo_ofertas_del_dia() {
        Assert.assertEquals(mercadoLibrePage.obtenerTituloOfertasDelDia(),"Oferta del día");
        driver.quit();
    }

    @When("Presiono sobre la categoria Supermercado")
    public void presiono_sobre_la_categoria_supermercado() {
        mercadoLibrePage.presionarBotonSupermercado();
    }

    @And("Presiono sobre Cafeteria")
    public void presiono_sobre_cafeteria() {
        mercadoLibrePage.presionarBotonCafeteria();

    }

    @Then("valido el titulo Cafeteria")
    public void valido_el_titulo_cafeteria() {
        Assert.assertEquals(mercadoLibrePage.obtenerTituloCafeteria(),"¡Sorpréndete con la intensidad del mejor café colombiano!");
        driver.quit();
    }

    //Ejercicio 2

    @When("Presiono sobre la categoria Vehiculos")
    public void presiono_sobre_la_categoria_vehiculos() {
        mercadoLibrePage.presionarBotonVehiculos();
    }
    @When("Selecciono la Marca Suzuki")
    public void selecciono_la_marca_suzuki() {
        mercadoLibrePage.presionarBotonSuzuki();
    }
    @When("Ingreso precio Minimo {string}")
    public void ingreso_precio_minimo(String string) {
        mercadoLibrePage.ingresarPrecioMinimo(string);
    }
    @When("Ingreso precio Maximo {string}")
    public void ingreso_precio_maximo(String string) {
        mercadoLibrePage.ingresarPrecioMaximo(string);
    }
    @When("Aplico el filtro")
    public void aplico_el_filtro() {
        mercadoLibrePage.presionarBotonFiltrarPorPrecio();
    }
    @Then("Valido la cantidad de resultados")
    public void valido_la_cantidad_de_resultados() {
        Assert.assertTrue(mercadoLibrePage.obtenerCantidadDeResultados());
        driver.quit();
    }

    @When("Presiono sobre la categoria Inmuebles")
    public void presiono_sobre_la_categoria_inmuebles() {
        mercadoLibrePage.presionarBotonInmuebles();
    }
    @When("Selecciono las Propiedades Usadas")
    public void selecciono_las_propiedades_usadas() {
        mercadoLibrePage.presionarBotonPropiedadesUsadas();
    }
    @Then("Valido cantidad de resultados")
    public void valido_cantidad_de_resultados() {
        Assert.assertTrue(mercadoLibrePage.obtenerCantidadDeResultados());
        driver.quit();
    }
}
