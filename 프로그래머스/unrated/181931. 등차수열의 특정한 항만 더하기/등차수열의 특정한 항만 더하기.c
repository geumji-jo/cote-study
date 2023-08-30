#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// included_len은 배열 included의 길이입니다.
int solution(int a, int d, bool included[], size_t included_len) {
    int answer = 0;
    for(int i =1; i <= included_len; i++) {
        if (included [i -1] == true) {
            answer += (a +(i-1) *d);
        }
    }
    return answer;
}