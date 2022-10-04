public class Test {
    public static void main(String[] args) {
        /*Se crea las ofertas académicas a partir del factory, NO se pone el new.
        En el mismo momento que se crea el curso se crea la Factory*/

        //Se crea el curso de FrontEnd
        OfertaAcademica frontEnd = OfertaAcademicaFactory.getInstance().crearOfertaAcademica("Curso");
        frontEnd.setNombre("FrontEnd");
        frontEnd.setDescripcion("FrontEnd");
        //Para setear los atributos de la clase "Curso" debemos castear el objeto frontEnd
        ((Curso)frontEnd).setCargaHoraria(16);
        ((Curso)frontEnd).setDuracion(2);
        ((Curso)frontEnd).setValorHora(1000);

        //Se crea el curso de BackEnd
        OfertaAcademica backEnd = OfertaAcademicaFactory.getInstance().crearOfertaAcademica("Curso");
        backEnd.setNombre("BackEnd");
        backEnd.setDescripcion("BackEnd");
        //Para setear los atributos de la clase "Curso" debemos castear el objeto backEnd
        ((Curso)backEnd).setCargaHoraria(20);
        ((Curso)backEnd).setDuracion(2);
        ((Curso)backEnd).setValorHora(900);

        //Se crea el Programa Intensivo FullStack
        OfertaAcademica fullStack = OfertaAcademicaFactory.getInstance().crearOfertaAcademica("ProgramaIntensivo");
        fullStack.setNombre("FullStack");
        fullStack.setDescripcion("FullStack");
        ((ProgramaIntensivo)fullStack).setPorcentajeBonificacion(0.20);

        //agregar Los cursos para el Programa Intensivo
        ((ProgramaIntensivo)fullStack).agregarOferta(frontEnd);
        ((ProgramaIntensivo)fullStack).agregarOferta(backEnd);

        //Creamos el Instituto y cargamos sus cursos
        Instituto instituto = new Instituto("Digital");
        instituto.agregarOferta(frontEnd);
        instituto.agregarOferta(backEnd);
        instituto.agregarOferta(fullStack);

        //Generamos el informe
        instituto.generarInforme();
    }
}
