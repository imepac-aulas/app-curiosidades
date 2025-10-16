
public class MenuApplication {


    public static void main(String[] args) {

        System.out.println("Menu de profissões --------------");
        mostrarEhfProfissional();
        mostrarIgorProfissional();
        mostrarTmsProfissional();
        System.out.println("--------------");
        mostrarLauraProfissional();
        System.out.println("--------------");
    }

    private static void mostrarEhfProfissional() {
        EhfProfissional ehfProfissional = new EhfProfissional();
        System.out.println(ehfProfissional.seuNome());
        System.out.println(ehfProfissional.suaAreaAtuacao());
        System.out.println();
    }
    public static void mostrarGccProfissional(){
        GccProfissional gccProfissional = new GccProfissional();
        System.out.println(gccProfissional.seuNome());
        System.out.println(gccProfissional.suaAreaAtuacao());
    }

    public static void mostrarLauraProfissional(){
        LarProfissional lauraProfissional = new LarProfissional();
        System.out.println(lauraProfissional.seuNome());
        System.out.println(lauraProfissional.suaAreaAtuacao());
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