class Pessoa:
    def __init__(self, nome, idade):
        self.nome = nome
        self.idade = idade

fila = []

def adicionar():
    nome = input("Nome: ")
    idade = int(input("Idade: "))
    fila.append(Pessoa(nome, idade))
    print(f"{nome} foi adicionado à fila.")

def atender():
    if fila:
        pessoa = fila.pop(0)
        print(f"{pessoa.nome} foi atendido.")
    else:
        print("Fila vazia.")

def buscar():
    nome = input("Digite o nome para buscar: ")
    for p in fila:
        if p.nome == nome:
            print(f"Encontrado: {p.nome}, {p.idade} anos")
            return
    print("Pessoa não encontrada.")

while True:
    print("\n1 - Adicionar\n2 - Atender\n3 - Buscar\n4 - Sair")
    opcao = input("Escolha: ")
    if opcao == "1":
        adicionar()
    elif opcao == "2":
        atender()
    elif opcao == "3":
        buscar()
    elif opcao == "4":
        break
    else:
        print("Opção inválida.")
