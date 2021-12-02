package secao11

import org.junit.Assert
import org.junit.Test

class contagemLetras {

    @Test fun contaVogal(){
        Assert.assertEquals(11,contaVogal("Quantas vogais tem esta frase?"))
    }

    @Test fun contaConsoante(){
        Assert.assertEquals(21,contaConsoante("Geralmente uma frase possui mais consoantes!"))
    }

    @Test fun contaVogaleConso(){
        val phrase="Estou gostando muito de aprender Kotlin"
        Assert.assertEquals(15,contaVogal(phrase))
        Assert.assertEquals(19,contaConsoante(phrase))
    }


}