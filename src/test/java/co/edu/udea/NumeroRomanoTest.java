package co.edu.udea;

import org.junit.Assert;
import org.junit.Test;

public class NumeroRomanoTest {

    private NumeroRomano numeroRomano = new NumeroRomano();

    @Test
    public void ObtenerNumeroRomanoSinParametros() {
        new NumeroRomano();
    }

    @Test
    public void ObtenerNumeroRomanoIParaDecimal1() {
        //arrang
        int decimal = 1;
        String romanoesperado = "I";
        String romanoObtenido;

        //act
        romanoObtenido = numeroRomano.convertir(decimal);

        //assert
        Assert.assertEquals(romanoObtenido, romanoesperado);
    }

    @Test
    public void ObtenerNumeroRomanoIIParaDecimal2() {
        //arrange
        int decimal = 2;
        String romanoesperado = "II";
        String romanoObtenido;

        //act
        romanoObtenido = numeroRomano.convertir(decimal);

        //assert
        Assert.assertEquals(romanoObtenido, romanoesperado);
    }

    @Test
    public void ObtenerNumeroRomanoIIIParaDecimal3() {
        //arrange
        int decimal = 3;
        String romanoesperado = "III";
        String romanoObtenido;

        //act
        romanoObtenido = numeroRomano.convertir(decimal);

        //assert
        Assert.assertEquals(romanoObtenido, romanoesperado);
    }

    @Test
    public void ObtenerNumeroRomanoIVParaDecimal4() {
        //arrange
        int decimal = 4;
        String romanoesperado = "IV";
        String romanoObtenido;

        //act
        romanoObtenido = numeroRomano.convertir(decimal);

        //assert
        Assert.assertEquals(romanoObtenido, romanoesperado);
    }

    @Test
    public void ObtenerNumeroRomanoVParaDecimal5() {
        //arrange
        int decimal = 5;
        String romanoesperado = "V";
        String romanoObtenido;

        //act
        romanoObtenido = numeroRomano.convertir(decimal);

        //assert
        Assert.assertEquals(romanoObtenido, romanoesperado);
    }

    @Test
    public void ObtenerNumeroRomanoVIParaDecimal6() {
        //arrange
        int decimal = 6;
        String romanoesperado = "VI";
        String romanoObtenido;

        //act
        romanoObtenido = numeroRomano.convertir(decimal);

        //assert
        Assert.assertEquals(romanoObtenido, romanoesperado);
    }

    @Test
    public void ObtenerNumeroRomanoVIIParaDecimal7() {
        //arrange
        int decimal = 7;
        String romanoesperado = "VII";
        String romanoObtenido;

        //act
        romanoObtenido = numeroRomano.convertir(decimal);

        //assert
        Assert.assertEquals(romanoObtenido, romanoesperado);
    }

    @Test
    public void ObtenerNumeroRomanoVIIIParaDecimal8() {
        //arrange
        int decimal = 8;
        String romanoesperado = "VIII";
        String romanoObtenido;

        //act
        romanoObtenido = numeroRomano.convertir(decimal);

        //assert
        Assert.assertEquals(romanoObtenido, romanoesperado);
    }

    @Test
    public void ObtenerNumeroRomanoIXParaDecimal9() {
        //arrange
        int decimal = 9;
        String romanoesperado = "IX";
        String romanoObtenido;

        //act
        romanoObtenido = numeroRomano.convertir(decimal);

        //assert
        Assert.assertEquals(romanoObtenido, romanoesperado);
    }

    @Test
    public void ObtenerNumeroRomanoXParaDecimal10() {
        //arrange
        int decimal = 10;
        String romanoesperado = "X";
        String romanoObtenido;

        //act
        romanoObtenido = numeroRomano.convertir(decimal);

        //assert
        Assert.assertEquals(romanoObtenido, romanoesperado);
    }

    @Test
    public void ObtenerNumeroRomanoXIParaDecimal11() {
        //arrange
        int decimal = 11;
        String romanoesperado = "XI";
        String romanoObtenido;

        //act
        romanoObtenido = numeroRomano.convertir(decimal);

        //assert
        Assert.assertEquals(romanoObtenido, romanoesperado);
    }


    @Test
    public void ObtenerNumeroRomanoXIVParaDecimal14() {
        //arrange
        int decimal = 14;
        String romanoesperado = "XIV";
        String romanoObtenido;

        //act
        romanoObtenido = numeroRomano.convertir(decimal);

        //assert
        Assert.assertEquals(romanoObtenido, romanoesperado);
    }

    @Test
    public void ObtenerNumeroRomanoXVParaDecimal15() {
        //arrange
        int decimal = 15;
        String romanoesperado = "XV";
        String romanoObtenido;

        //act
        romanoObtenido = numeroRomano.convertir(decimal);

        //assert
        Assert.assertEquals(romanoObtenido, romanoesperado);
    }

    @Test
    public void ObtenerNumeroRomanoXIXParaDecimal19() {
        //arrange
        int decimal = 19;
        String romanoesperado = "XIX";
        String romanoObtenido;

        //act
        romanoObtenido = numeroRomano.convertir(decimal);

        //assert
        Assert.assertEquals(romanoObtenido, romanoesperado);
    }

    @Test
    public void ObtenerNumeroRomanoXXParaDecimal20() {
        //arrange
        int decimal = 20;
        String romanoesperado = "XX";
        String romanoObtenido;

        //act
        romanoObtenido = numeroRomano.convertir(decimal);

        //assert
        Assert.assertEquals(romanoObtenido, romanoesperado);
    }

    @Test
    public void ObtenerNumeroRomanoXXParaDecimal22() {
        //arrange
        int decimal = 22;
        String romanoesperado = "XXII";
        String romanoObtenido;

        //act
        romanoObtenido = numeroRomano.convertir(decimal);

        //assert
        Assert.assertEquals(romanoObtenido, romanoesperado);
    }

    @Test
    public void ObtenerNumeroRomanoXXIVParaDecimal24() {
        //arrange
        int decimal = 24;
        String romanoesperado = "XXIV";
        String romanoObtenido;

        //act
        romanoObtenido = numeroRomano.convertir(decimal);

        //assert
        Assert.assertEquals(romanoObtenido, romanoesperado);
    }

    @Test
    public void ObtenerNumeroRomanoXXIXParaDecimal29() {
        //arrange
        int decimal = 29;
        String romanoesperado = "XXIX";
        String romanoObtenido;

        //act
        romanoObtenido = numeroRomano.convertir(decimal);

        //assert
        Assert.assertEquals(romanoObtenido, romanoesperado);
    }

    @Test
    public void ObtenerNumeroRomanoXXXParaDecimal30() {
        //arrange
        int decimal = 30;
        String romanoesperado = "XXX";
        String romanoObtenido;

        //act
        romanoObtenido = numeroRomano.convertir(decimal);

        //assert
        Assert.assertEquals(romanoObtenido, romanoesperado);
    }

    @Test
    public void ObtenerNumeroRomanoXXXIVParaDecimal34() {
        //arrange
        int decimal = 34;
        String romanoesperado = "XXXIV";
        String romanoObtenido;

        //act
        romanoObtenido = numeroRomano.convertir(decimal);

        //assert
        Assert.assertEquals(romanoObtenido, romanoesperado);
    }

    @Test
    public void ObtenerNumeroRomanoXXXIXParaDecimal39() {
        //arrange
        int decimal = 39;
        String romanoesperado = "XXXIX";
        String romanoObtenido;

        //act
        romanoObtenido = numeroRomano.convertir(decimal);

        //assert
        Assert.assertEquals(romanoObtenido, romanoesperado);
    }

    @Test
    public void ObtenerNumeroRomanoXLParaDecimal40() {
        //arrange
        int decimal = 40;
        String romanoesperado = "XL";
        String romanoObtenido;

        //act
        romanoObtenido = numeroRomano.convertir(decimal);

        //assert
        Assert.assertEquals(romanoObtenido, romanoesperado);
    }

}
