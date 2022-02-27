# coding:utf-8
from __future__ import print_function

#조건문
# 1: 조건에 따라실행할 명령이 달라 지는것

#기존비밀번호
origin_pass = "1234"
input_pass = str(input("패스워드를 입력하세요.>>>"))

if input_pass == origin_pass: #조건 A
    #조건 A 참
    print("로그인 성공!")
    print("반갑습니다.")
elif input_pass == "": #빈 문자열
    # 조건 A가 거짓이면서 조건 B가참
    print("아무것도 입력하지 않았습니다.")
else :
    #조건 A 거짓
    print("로그인 실패!")
    print("비밀번호 확인필요")