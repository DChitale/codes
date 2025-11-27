#include <stdio.h>
#include <sys/stat.h>
#include <dirent.h>

int main() {
    // Create Directory
    mkdir("mydir", 0755);

    // List directory contents
    DIR *d = opendir(".");
    struct dirent *entry;

    printf("Directory contents:\n");
    while ((entry = readdir(d)) != NULL) {
        printf("%s\n", entry->d_name);
    }
    closedir(d);

    return 0;
}
