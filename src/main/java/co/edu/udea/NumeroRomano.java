package co.edu.udea;

public class NumeroRomano {

    public String convertir(int decimal) {
        String numeroRomano;

        if (decimal >= 10) {
            numeroRomano = convertirDecenas(decimal / 10) + convertirUnidades(decimal % 10);
        } else {
            numeroRomano = convertirUnidades(decimal);
        }
        return numeroRomano;
    }

    public String repetirBase(String base, int cantidad) {
        String adicionar = "";
        for (int i = 0; i < cantidad; i++) {
            adicionar = adicionar + base;
        }
        return adicionar;
    }

    public String convertirUnidades(int unidades) {
        String numeroRomano;
        if (unidades == 9) {
            numeroRomano = "IX";
        } else if (unidades >= 5) {
            numeroRomano = "V" + repetirBase("I", unidades - 5);
        } else if (unidades == 4) {
            numeroRomano = "IV";
        } else {
            numeroRomano = repetirBase("I", unidades);
        }
        return numeroRomano;
    }

    public String convertirDecenas(int decenas) {
        String numeroRomano;
        if (decenas == 4) {
            numeroRomano = "XL";
        } else {
            numeroRomano = repetirBase("X", decenas);
        }

        return numeroRomano;
    }

}
