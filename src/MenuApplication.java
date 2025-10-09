public class MenuApplication {


    public static void main(String[] args) {

        System.out.println("Menu de profissões --------------");
        mostrarEhfProfissional();
        mostrarGrcProfissional();
        System.out.println("--------------");
    }

    public static void mostrarEhfProfissional() {
        EhfProfissional ehfProfissional = new EhfProfissional();
        System.out.println(ehfProfissional.seuNome());
        System.out.println(ehfProfissional.suaAreaAtuacao());
    }
    public static void mostrarGrcProfissional() {
        GrcProfissional grcProfissional = new GrcProfissional();
        System.out.println(grcProfissional.seuNome());
        System.out.println(grcProfissional.suaAreaAtuacao());
    }
}