public class ProductoFactory {
    private static ProductoFactory instance;

    private ProductoFactory() {

    }

    public static ProductoFactory getInstance(){
        if(instance == null)
            instance = new ProductoFactory();
        return instance;
    }

    public static Producto crearProducto(String codigo) throws Exception {
        Producto nuevoProducto = switch (codigo) {
            case "CAJA10X10" -> new Caja(500);
            case "PELOTAFUTBOL" -> new Pelota(300, 11);
            case "PELOTATENIS" -> new Pelota(150, 0.32);
            default -> throw new Exception();
        };
        return nuevoProducto;
    }
}
