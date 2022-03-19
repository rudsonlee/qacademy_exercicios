package ExerciciosMetodos.metodosComParametros;

public class MetodosComParametros {
    public static void main(String[] args) {
        metodoUm("rudson");
        metodoDois("bruno");
        metodoTres("lee");
        metodoQuatro("jhony");
        metodoCinco("diana");
        
        System.out.println(RetornoUm("Retorno UM"));
        System.out.println(RetornoDois("Retorno Dois"));
        System.out.println(RetornoTres("Retorno Tres"));
        System.out.println(RetornoQuatro("Retorno Quatro"));
        System.out.println(RetornoCinco("Retorno Cinco"));
    }

    public static void metodoUm(String teste1) {
        System.out.println(teste1);
    }
    public static void metodoDois(String teste2) {
        System.out.println(teste2);
    }
        public static void metodoTres(String teste3) {
            System.out.println(teste3);
        }
        public static void metodoQuatro(String teste4) {
             System.out.println(teste4);
        }
             public static void metodoCinco(String teste5) {
                System.out.println(teste5);

             }






             public static String RetornoUm(String teste1) {
        
                return teste1;
            }
            public static String RetornoDois(String teste2) {

                return teste2;
            }
                public static String RetornoTres(String teste3) {

                    return teste3;
                }
                public static String RetornoQuatro(String teste4) {
  
                    return teste4;
                }
                     public static String RetornoCinco(String teste5) {
 
                        return teste5;
        
                     }






}

