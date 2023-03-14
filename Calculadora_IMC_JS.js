let peso = input('Digite o seu peso:')
let altura = input('Digite sua altura: ')

if (peso <= 0 & altura <= 0)
    print('ERRO. Os números digitados devem ser positivos')
else
    IMC = (peso / altura) ** 2
IMC_arredondado = Math.round(IMC)

function calc_imc() {
    if (IMC < 18.5)
        print(`IMC = ${IMC_arredondado}, Abaixo do peso`)
    else if (IMC >= 18.6 & IMC <= 24.9)
        print(`IMC = ${IMC_arredondado}, Peso Ideal (Parabéns)`)
    else if (IMC >= 25.0 & IMC <= 29.9)
        print(`IMC = ${IMC_arredondado}, Acima do Peso`)
    else if (IMC >= 30.0 & IMC <= 34.9)
        print(`IMC = ${IMC_arredondado}, Obesidade Grau 1`)
    else if (IMC >= 35.0 & IMC <= 39.9)
        print(`IMC = ${IMC_arredondado}, Obesidade Grau 2 (Severa)`)
    else if (IMC > 40)
        print(`IMC = ${IMC_arredondado}, Obesidade Grau 3 (Mórbida)`)
}