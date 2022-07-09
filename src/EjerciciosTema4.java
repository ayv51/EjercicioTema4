import static java.lang.System.out;

public class EjerciciosTema4 {
    public static void main(String[] args) {

        var numeroIf = 0;
        if (numeroIf > 0){
            System.out.println("Es positivo.");
        } else if(numeroIf < 0){
            System.out.println("Es negativo.");
        }else {
            System.out.println("0");
        }

        var numeroWhile = 0;
        while(numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile ++;
        }

        do {
            numeroWhile ++;
        } while(numeroWhile < 3);


        for (var numeroFor = 0; numeroFor <= 3; numeroFor ++){
            System.out.println(numeroFor);
        }

        var estacion = "";
        switch(estacion){
            case "Verano":
                System.out.println("Estas en verano.");
                break;
            case "Otoño":
                System.out.println("Estas en otoño.");
                break;
            case "Invierno":
                System.out.println("Estas en invierno.");
                break;
            case "Primavera":
                System.out.println("Estas en primavera.");
                break;
            default:
                System.out.println("No es una estacion.");
        }
    }
}
