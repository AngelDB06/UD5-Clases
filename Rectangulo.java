class Rectangulo {
    int base, altura;
    static int rtotal;

    Rectangulo (int b, int a){
        base=b;
        altura=a;
    }

    int getRectangulosCrados(){
        return rtotal;
    }

    void montarRectangulo(){
        for (int i=0; i<altura;i++){
            for (int p=0; i<base; p++){
                System.out.print('*');
            }
            System.out.println();
        }
    }


}
