# coding:utf-8
from __future__ import print_function

# -*- coding: utf-8 -*
# 주석(comment)
# 설명을 적거나 코들 실행을 막고 싶을 때 사용
# 소스코드(=명령어)
print("Hello")

# 자료형
# 1. 숫자형
# 정수형: 소수점이 없는수 Integer -int
# 실수형: 소수점이 있는 float
print(-1,0,30)
print(-2.5,2,12.8)

# -*- coding: utf-8 -*-
# 2. 문자열 ( 문자형 )
# " 나 ' 로 문자의 시작과 끝을 나타냄
# end="" 사용시에는 줄바꿈 안되고붙여서 사용가능
# [참고사항]
# end="" 사용시에 SyntaxError: invalid syntax 에러발생한경우 해결
# 참고주소URL : https://40holic.tistory.com/72 해결
# 상단에 아래 소스 추가 후 실행하니 되었다.
# coding:utf-8
# from __future__ import print_function

print("코딩으로 돈벌기", end=" ")
print('절대 포기하지 말자')

#3.불리형
# 참 또는 거짓
print(True,False)