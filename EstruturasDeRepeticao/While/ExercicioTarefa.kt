fun main() {
    val tarefas = mutableListOf<String>()
    
    while (true) {
        println("\nMenu de Opções:")
        println("1. Adicionar Tarefa")
        println("2. Marcar Tarefa como Concluída")
        println("3. Ver Tarefas Pendentes")
        println("4. Sair")
        print("Escolha uma opção: ")
        
        val opcao = readLine()
        val opcaoInt = opcao?.toIntOrNull()
        
        when (opcaoInt) {
            1 -> {
                print("Digite a nova tarefa: ")
                val tarefa = readLine()
                if (tarefa != null) {
                    tarefas.add(tarefa)
                    println("Tarefa adicionada!")
                }
            }
            
            2 -> {
                println("Tarefas Pendentes:")
                tarefas.forEachIndexed { index, tarefa ->
                    println("${index + 1}. $tarefa")
                }
                print("Digite o número da tarefa concluída: ")
                val indexStr = readLine()
                val index = indexStr?.toIntOrNull()
                if (index != null && index > 0 && index <= tarefas.size) {
                    tarefas.removeAt(index - 1)
                    println("Tarefa marcada como concluída!")
                } else {
                    println("Número inválido.")
                }
            }
            
            3 -> {
                println("Tarefas Pendentes:")
                if (tarefas.isEmpty()) {
                    println("Nenhuma tarefa pendente.")
                } else {
                    tarefas.forEach { tarefa ->
                        println("- $tarefa")
                    }
                }
            }
            
            4 -> {
                println("Aplicativo encerrado.")
                break
            }
            
            else -> println("Opção inválida. Tente novamente.")
        }
    }
}