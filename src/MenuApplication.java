
public class MenuApplication {


    public static void main(String[] args) {

        System.out.println("Menu de profissões --------------");
        mostrarEhfProfissional();
        mostrarJvSProfissional();
        mostrarIgorProfissional();
        mostrarTmsProfissional();
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
    public static void mostrarGccProfissional(){
        GccProfissional gccProfissional = new GccProfissional();
        System.out.println(gccProfissional.seuNome());
        System.out.println(gccProfissional.suaAreaAtuacao());
    }
    public static void mostrarJvSProfissional() {
        JvSProfissional JvSProfissional = new JvSProfissional();
        System.out.println(JvSProfissional.seuNome());
        System.out.println(JvSProfissional.suaAreaAtuacao());
    }
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
