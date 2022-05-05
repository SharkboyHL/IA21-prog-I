import * as readline from 'readline'
import { stdin as input, stdout as output } from 'process'
const rl = readline.createInterface({ input, output })
const question = question => new Promise((resolve, reject) => rl.question(question, answer => resolve(answer)))

const color = {
  reset: "\x1b[0m",
  bright: "\x1b[1m",
  dim: "\x1b[2m",
  underscore: "\x1b[4m",
  blink: "\x1b[5m",
  reverse: "\x1b[7m",
  hidden: "\x1b[8m",
  
  fg: {
      black: "\x1b[30m",
      red: "\x1b[31m",
      green: "\x1b[32m",
      yellow: "\x1b[33m",
      blue: "\x1b[34m",
      magenta: "\x1b[35m",
      cyan: "\x1b[36m",
      white: "\x1b[37m",
      crimson: "\x1b[38m" // Scarlet
  },
  bg: {
      black: "\x1b[40m",
      red: "\x1b[41m",
      green: "\x1b[42m",
      yellow: "\x1b[43m",
      blue: "\x1b[44m",
      magenta: "\x1b[45m",
      cyan: "\x1b[46m",
      white: "\x1b[47m",
      crimson: "\x1b[48m"
  }
};

let soma = 0
let count = 0

while (true) {
  const strNota = await question('Insira o valor ' + (count + 1) + ' ou (N) para realizar as médias: ')

  if (strNota.toUpperCase() == 'N') break

  const nota = parseFloat(strNota)

  if (isNaN(nota)) {
    console.log()
    console.log(color.fg.red + '[ ERROR ] Valor inválido, insira números postivos iguais ou menores que 10, ou insira (N) para realizar as médias' + color.reset)
    console.log()
    continue
  }

  if (nota < 0 || nota > 10) {
    console.log()
    console.log(color.fg.red  + '[ ERROR ] Valor inválido, insira números postivos iguais ou menores que 10, ou insira (N) para realizar as médias' + color.reset)
    console.log()
    continue
  }

  soma = soma + nota
  count += 1
}

if (count == 0) {
  console.log()
  console.log(color.fg.red + 'Você não inseriu nenhum valor' + color.reset)
  process.exit()
}

let media = soma / count
console.log()
console.log(color.fg.green + '[ RESULT ] A média dos valores é:' + color.reset , media)
process.exit()