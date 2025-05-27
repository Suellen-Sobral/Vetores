#include <stdio.h>
#include <string.h>

#define MAX 100

typedef struct {
    char nome[50];
    int idade;
} Pessoa;

Pessoa fila[MAX];
int inicio = 0, fim = 0;

void adicionar() {
    if (fim < MAX) {
        printf("Nome: ");
        scanf("%s", fila[fim].nome);
        printf("Idade: ");
        scanf("%d", &fila[fim].idade);
        fim++;
    } else {
        printf("Fila cheia!\n");
    }
}

void atender() {
    if (inicio < fim) {
        printf("%s foi atendido.\n", fila[inicio].nome);
        inicio++;
    } else {
        printf("Fila vazia!\n");
    }
}

void buscar() {
    char nome[50];
    printf("Buscar por nome: ");
    scanf("%s", nome);
    for (int i = inicio; i < fim; i++) {
        if (strcmp(fila[i].nome, nome) == 0) {
            printf("Encontrado: %s, %d anos\n", fila[i].nome, fila[i].idade);
            return;
        }
    }
    printf("Pessoa não encontrada.\n");
}

int main() {
    int opcao;
    while (1) {
        printf("\n1 - Adicionar\n2 - Atender\n3 - Buscar\n4 - Sair\nEscolha: ");
        scanf("%d", &opcao);
        switch(opcao) {
            case 1: adicionar(); break;
            case 2: atender(); break;
            case 3: buscar(); break;
            case 4: return 0;
            default: printf("Opção inválida.\n");
        }
    }
}
