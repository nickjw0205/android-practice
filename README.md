# 1. View

| 대표적인 레이아웃 5가지| |
| :---: | :---: |
| 제약 레이아웃  | 제약 조건 기반 모델 |
| 리니어 레이아웃 | 박스 모델 |
| 상대 레이아웃  | 규칙 모델 |
| 프레임 레리아웃 | 싱글 모델 |
| 테이블 레이아웃의| 격자 모델 |

## layout(필수 속성)

    1. height   ->  뷰의 높이(세로)를 설정
    2. width    ->  뷰의 폭(가로)을 설정

##참고

    padding :    테두리 안쪽공간
    1. padding
    2. paddingTop
    3. paddingBottom
    4. paddingLeft
    5. paddingRight
-------
    margin  :    테두리 바깥공간
    1. layout_margin
    2. layout_marginTop
    3. layout_marginBottom
    4. layout_marginLeft
    5. layout_marginRight


## 값 설정

    1. wrap_content -> 내용물의 크기를 자동으로 맞춤. 
    2. match_parent -> 뷰그룹의 여유공간을 꽉 채움.
    3. 숫자로 지정     -> 숫자를 통해 크기를 지정(단위 필수). 

## 연결선 만들기

###### - 타겟이 가능한 것.
        1. 같은 레이아웃 안에 들어있는 다른 뷰의 연결점.
        2. 부모 레이아웃의 연결점
        3. 가이드라인

###### - 대상 뷰와 타겟의 연결점.
        1. 위, 아래, 오른쪽, 왼쪽
        2. 가로축, 세로축 가운데
        3. 베이스라인 (텍스트를 보여주는 뷰인 경우에만)

## 배경색 지정

    #ARGB(A: Alpha, R: Red, G: Green, B: Blue)

    ex)
    알파값 추가전
    #ff0000 -> 빨간색
    #00ff00 -> 녹색
    #0000ff -> 파란색 

    알파값 추가후
    #ffff0000 -> 빨간색
    #88ㄹㄹ0000 -> 반투명 빨간색





    















