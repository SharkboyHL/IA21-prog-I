const readline = require('readline')
const { stdin: input, stdout: output } = require('process')
  const rl = readline.createInterface({ input, output })
 
  const question = question => new Promise((resolve, reject) => rl.question(question, answer => resolve(answer)))
 
async function main() {

  let soma = 0
  let count = 0
  let num = ''
  
  while (true) {
    num = await question('Insira o valor ' + (count + 1) + ' ou (N) para realizar as médias: ')
    if (num.toUpperCase() == 'N') break
    soma += parseInt(num)
    count += 1
  }
  
  media = soma/count
  console.log('A média dos valores é: ', media)
}
main()
