package pages;

import base.WebBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MercadoLibrePage extends WebBasePage {

    public MercadoLibrePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Categorías']")
    private WebElement btnCategorias;

    //Construccion
    @FindBy(xpath = "(//a[text()='Construcción'])[1]")
    private WebElement btnConstruccion;
    @FindBy(xpath = "//a[text()='Ver más']")
    private WebElement btnVerMas;
    @FindBy(xpath = "//a[text()='Mobiliario para Baños']")
    private WebElement btnMobilarioParaBanos;
    @FindBy(xpath = "//a[text()='Grifería para Baño']")
    private WebElement btnGriferiaParaBano;
    @FindBy(xpath = "//h1[text()='Grifería para Baño']")
    private WebElement tituloGriferiaParaBano;

    //Tecnologia
    @FindBy(xpath = "//a[text()='Tecnología']")
    private WebElement btnTecnologia;
    @FindBy(xpath = "//*[text()='Accesorios para Celulares']")
    private WebElement btnAccesoriosParaCelulares;
    @FindBy(xpath = "//span[text()='Celulares y Telefonía']")
    private WebElement tituloCelularesYTelefonia;
    @FindBy(xpath = "//h2[text()='Accesorios para Celulares']")
    private WebElement tituloAccesoriosParaCelulares;

    //Ofertas
    @FindBy(xpath = "//a[text()='Ofertas']")
    private WebElement btnOfertas;
    @FindBy(xpath = "//a[text()='Oferta del día']")
    private WebElement btnOfertasDelDia;
    @FindBy(xpath = "//span[text()='Oferta del día']")
    private WebElement spanOfertasDelDia;

    //Supermercado
    @FindBy(xpath = "(//a[text()='Supermercado'])[2]")
    private WebElement btnSupermercado;
    @FindBy(xpath = "//span[text()='Cafeteria']")
    private WebElement btnCafeteria;
    @FindBy(xpath = "//h3[text()='¡Sorpréndete con la intensidad del mejor café colombiano!']")
    private WebElement h3TituloCafeteria;

    //Ejercicio 2
    //Vehiculo
    @FindBy(xpath = "//a[text()='Vehículos']")
    private WebElement btnVehiculo;
    @FindBy(xpath = "//span[text()='suzuki']")
    private WebElement btnSuzuki;
    @FindBy(xpath = "//input[@data-testid=\"Minimum-price\"]")
    private WebElement inputMinimo;
    @FindBy(xpath = "//input[@data-testid=\"Maximum-price\"]")
    private WebElement inputMaximo;
    @FindBy(xpath = "//button[@data-testid=\"submit-price\"]")
    private WebElement btnFiltroPrecio;
    @FindBy(xpath = "//*[@id=\"root-app\"]/div/div[2]/aside/div[2]/span")
    private WebElement cantidadDeResultados;

    //Inmuebles
    @FindBy(xpath = "//a[text()='Inmuebles']")
    private WebElement btnInmuebles;
    @FindBy(xpath = "//h3[text()='Usadas']")
    private WebElement btnPropiedadesUsadas;

    public void presionarBotonCategorias() {
        if (esVisible(btnCategorias)){
            clickJS(btnCategorias);
            esperar(2);
            System.out.println("Se presionó el botón 'Categorias'.");
        }
    }

    public void presionarBotonConstruccion() {
        if (esVisible(btnConstruccion)){
            scrollToElement(btnConstruccion);
            clickJS(btnConstruccion);
            esperar(2);
            System.out.println("Se presionó el botón 'Constuccion'.");
        }
    }

    public void presionarBotonVerMas() {
        if (esVisible(btnVerMas)){
            clickJS(btnVerMas);
            esperar(2);
            System.out.println("Se presionó el botón 'Ver Mas'.");
        }
    }

    public void presionarBotonMobilarioParaBanos() {
        if (esVisible(btnMobilarioParaBanos)){
            scrollToElement(btnMobilarioParaBanos);
            clickJS(btnMobilarioParaBanos);
            esperar(2);
            System.out.println("Se presionó el botón 'Mobiliario para Baños'.");
        }
    }

    public void presionarBotonGriferiaParaBano() {
        if (esVisible(btnGriferiaParaBano)){
            clickJS(btnGriferiaParaBano);
            esperar(2);
            System.out.println("Se presionó el botón 'Grifería para Baño'.");
        }
    }

    public String obtenerTituloGiferiaParaBano(){
        esVisible(tituloGriferiaParaBano);
        return tituloGriferiaParaBano.getText();
    }

    public void presionarBotonTecnologia() {
        if (esVisible(btnTecnologia)){
            btnTecnologia.click();
            esperar(2);
            System.out.println("Se presionó el botón 'Tecnologia'.");
        }
    }

    public void presionarBotonAccesoriosParaCelulares() {
        if (esVisible(btnAccesoriosParaCelulares)){
            btnAccesoriosParaCelulares.click();
            esperar(2);
            System.out.println("Se presionó el botón 'Accesorios Para Celulares'.");
        }
    }

    public String obtenerTituloCelularesYTelefonia(){
        esVisible(tituloCelularesYTelefonia);
        return tituloCelularesYTelefonia.getText();
    }
    
    public String obtenerTituloAccesoriosParaCelulares(){
        esVisible(tituloAccesoriosParaCelulares);
        return tituloAccesoriosParaCelulares.getText();
    }

    public void presionarBotonOfertas() {
        if (esVisible(btnOfertas)){
            clickJS(btnOfertas);
            esperar(2);
            System.out.println("Se presionó el botón 'Ofertas'.");
        }
    }

    public void presionarBotonOfertasDelDia() {
        if (esVisible(btnOfertasDelDia)){
            clickJS(btnOfertasDelDia);
            esperar(2);
            System.out.println("Se presionó el botón 'Ofertas del Dia'.");
        }
    }

    public String obtenerTituloOfertasDelDia(){
        esVisible(spanOfertasDelDia);
        return spanOfertasDelDia.getText();
    }

    public void presionarBotonSupermercado() {
        if (esVisible(btnSupermercado)){
            clickJS(btnSupermercado);
            esperar(2);
            System.out.println("Se presionó el botón 'Supermercado'.");
        }
    }

    public void presionarBotonCafeteria() {
        if (esVisible(btnCafeteria)){
            clickJS(btnCafeteria);
            esperar(2);
            System.out.println("Se presionó el botón 'Cafeteria'.");
        }
    }

    public String obtenerTituloCafeteria(){
        esVisible(h3TituloCafeteria);
        return h3TituloCafeteria.getText();
    }

    //Ejercicio 2

    public void presionarBotonVehiculos() {
        if (esVisible(btnVehiculo)){
            clickJS(btnVehiculo);
            esperar(2);
            System.out.println("Se presionó el botón 'Vehiculos'.");
        }
    }

    public void presionarBotonSuzuki() {
        if (esVisible(btnSuzuki)){
            scrollToElement(btnSuzuki);
            esperar(2);
            clickJS(btnSuzuki);
            esperar(2);
            System.out.println("Se presionó el botón 'Suzuki'.");
        }
    }

    public void ingresarPrecioMinimo(String minimo) {
        if (esVisible(inputMinimo)){
            scrollToElement(inputMinimo);
            esperar(2);
            inputMinimo.sendKeys(minimo);
            esperar(2);
            System.out.println("Se ingresa el Precio 'Minimo'.");
        }
    }

    public void ingresarPrecioMaximo(String maximo) {
        if (esVisible(inputMaximo)){
            esperar(2);
            inputMaximo.sendKeys(maximo);
            esperar(2);
            System.out.println("Se ingresa el Precio 'Maximo'.");
        }
    }

    public void presionarBotonFiltrarPorPrecio() {
        if (esVisible(btnFiltroPrecio)){
            clickJS(btnFiltroPrecio);
            esperar(2);
            System.out.println("Se presionó el botón 'Filtrar por Precio'.");
        }
    }

    public Boolean obtenerCantidadDeResultados(){
        esVisible(cantidadDeResultados);
        String texto = cantidadDeResultados.getText();
        if (texto.contains("resultados")) {
            System.out.println("El texto contiene '"+ texto +" resultados' ✅");
            return true;
        } else {
            System.out.println("El texto NO contiene 'resultados' ❌");
            return false;
        }
    }

    public void presionarBotonInmuebles() {
        if (esVisible(btnInmuebles)){
            clickJS(btnInmuebles);
            esperar(2);
            System.out.println("Se presionó el botón 'Inmuebles'.");
        }
    }

    public void presionarBotonPropiedadesUsadas() {
        if (esVisible(btnPropiedadesUsadas)){
            esperar(2);
            clickJS(btnPropiedadesUsadas);
            esperar(2);
            System.out.println("Se presionó el botón 'Propiedades Usadas'.");
        }
    }
}
