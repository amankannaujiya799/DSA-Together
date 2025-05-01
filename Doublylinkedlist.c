#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node *prev, *next;
};

int main() {
    struct Node *head, *middle, *tail;
    
    head = (struct Node*)malloc(sizeof(struct Node));
    middle = (struct Node*)malloc(sizeof(struct Node));
    tail = (struct Node*)malloc(sizeof(struct Node));

    head->data = 10;
    middle->data = 20;
    tail->data = 30;

    head->prev = NULL;
    head->next = middle;
    
    middle->prev = head;
    middle->next = tail;
    
    tail->prev = middle;
    tail->next = NULL;

    struct Node* temp = head;
    printf("Forward: ");
    while (temp != NULL) {
        printf("%d ", temp->data);
        temp = temp->next;
    }

    temp = tail;
    printf("\nBackward: ");
    while (temp != NULL) {
        printf("%d ", temp->data);
        temp = temp->prev;
    }

    return 0;
}
