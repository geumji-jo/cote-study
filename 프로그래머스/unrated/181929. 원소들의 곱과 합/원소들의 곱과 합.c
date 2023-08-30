#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// num_list_len은 배열 num_list의 길이입니다.
int solution(int num_list[], size_t num_list_len) {
    int answer = 0;
    int re1 =0;
    int re2 =1;
    for (int i =0; i < num_list_len; i++) {
       re1 += num_list[i];
       re2 *= num_list[i];
        if(re2 < re1 *re1) {
            answer = 1;
        }else if( re1 *re1 < re2) {
            answer = 0;
        }
    }
    return answer;
}