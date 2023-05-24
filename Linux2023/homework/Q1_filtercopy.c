#include<stdio.h>
int main(int argc, char* argv[]){
    char c;
    FILE *fp1, *fp2;

    if(argc < 4){
        fprintf(stderr, "usage: %s file1 file2 deleteWord\n", argv[0]);
        return 1;
    }

    fp1 = fopen(argv[1], "r");
    if(fp1 == NULL){
        fprintf(stderr, "Failed to open %s\n", argv[1]);
        return 2;
    }

    fp2 = fopen(argv[2], "w");

    while((c=fgetc(fp1)) != EOF){
        if(c != *argv[3]){
            fputc(c, fp2);
        }
    }

    fclose(fp1);
    fclose(fp2);

    return 0;
}