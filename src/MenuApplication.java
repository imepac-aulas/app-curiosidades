public class MenuApplication {


    public static void main(String[] args) {

        System.out.println("Menu de profissões --------------");
        mostrarEhfProfissional();
        mostrarJvSProfissional();
        System.out.println("--------------");
        
    }

    public static void mostrarEhfProfissional() {
        EhfProfissional ehfProfissional = new EhfProfissional();
        System.out.println(ehfProfissional.seuNome());
        System.out.println(ehfProfissional.suaAreaAtuacao());
    }
    public static void mostrarJvSProfissional() {
        JvSProfissional JvSProfissional = new JvSProfissional();
        System.out.println(JvSProfissional.seuNome());
        System.out.println(JvSProfissional.suaAreaAtuacao());
    }
}
