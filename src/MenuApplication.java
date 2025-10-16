public class MenuApplication {


    public static void main(String[] args) {

        System.out.println("Menu de profissões --------------");
        mostrarEhfProfissional();
        mostrarSamelaProfissional();
        System.out.println("--------------");
        mostrarGccProfissional();
                System.out.println("--------------");
    }

    private static void mostrarEhfProfissional() {
        EhfProfissional ehfProfissional = new EhfProfissional();
        System.out.println(ehfProfissional.seuNome());
        System.out.println(ehfProfissional.suaAreaAtuacao());
        System.out.println();
    }

    public static void mostrarSamelaProfissional() {
        SmsfProfissional smsfProfissional = new SmsfProfissional();
        System.out.println(smsfProfissional.seuNome());
        System.out.println(smsfProfissional.suaAreaAtuacao());
        System.out.println("Samela alterei seu arquivo");
    }
    public static void mostrarGccProfissional(){
        GccProfissional gccProfissional = new GccProfissional();
        System.out.println(gccProfissional.seuNome());
        System.out.println(gccProfissional.suaAreaAtuacao());
    }

        public static void mostrarIgorProfissional() {
            IgorProfissional igorProfissional = new IgorProfissional();
            System.out.println(igorProfissional.seuNome());
            System.out.println(igorProfissional.suaAreaAtuacao());

            System.out.println("Alterei seu arquivo...");


            System.out.println("Joãozin passou nesse branch papae hehe kk");
            System.out.println("Sua branch foi sorteada, xoxo Saminha.");

        }
}