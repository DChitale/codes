#include <stdio.h>
#include <stdlib.h>

int main() {
    FILE *fp;

    // Create / Write
    fp = fopen("myfile.txt", "w");
    if (!fp) {
        printf("Error creating file!\n");
        return 1;
    }
    fprintf(fp, "Hello from C file system program!\n");
    fclose(fp);

    // Read
    fp = fopen("myfile.txt", "r");
    if (!fp) {
        printf("Error reading file!\n");
        return 1;
    }

    char buff[100];
    printf("File content:\n");
    while (fgets(buff, 100, fp) != NULL)
        printf("%s", buff);
    fclose(fp);

    // Delete file
    if (remove("myfile.txt") == 0)
        printf("\nFile deleted.\n");
    else
        printf("\nUnable to delete file.\n");

    return 0;
}
