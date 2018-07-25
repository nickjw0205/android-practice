# 1. View

| 대표적인 레이아웃 5가지| |
| :---: | :---: |
| 제약 레이아웃  | 제약 조건 기반 모델 |
| 리니어 레이아웃 | 박스 모델 |
| 상대 레이아웃  | 규칙 모델 |
| 프레임 레리아웃 | 싱글 모델 |
| 테이블 레이아웃 | 격자 모델 |

## layout

    1. height   ->  뷰의 높이(세로)를 설정
    2. width    ->  뷰의 폭(가로)을 설정
    3. weight   ->  부모 컨테이너에 남아있는 여유공간을 분할하여 기존에 추가했던 뷰를 할당가능
                    (1로 지정시 2개의 뷰가 반반씩, 1과 2로 지정시 1/3과 2/3로 할당)


## padding

[코드](https://github.com/nickjw0205/android-practice/blob/master/SampleLinearLayout/app/src/main/res/layout/padding.xml)

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
    #88ff0000 -> 반투명 빨간색


## gravity속성으로 뷰 정렬하기

[코드](https://github.com/nickjw0205/android-practice/blob/master/SampleLinearLayout/app/src/main/res/layout/gravity.xml)

| 정렬속성 | 설명 |
| :-- | :-- |
| layout_gravity | 부모 컨테이너의 여유 공간에 뷰가 모두 채워지지않아 여유공간이 생겼을 때 여유공간 안에서 뷰를 지정|
| gravity | 뷰 안에 표시하는 내용물을 정렬할 때 |


| 정렬속성 | 설명 |
| :-- | :-- |
| top | 위쪽 끝 |
| bottom | 아래쪽 끝 |
| left | 왼쪽 끝 |
| right | 오른쪽 끝 |
| center_vertical | 수직방향의 중앙 |
| center_horizontal | 수평방향의 중앙 |
| fill_vertical | 수직방향으로 여유공간만큼 확대하여 채우기 |
| fill_horizontal | 수평방향으로 여유공간만큼 확대하여 채우기 |
| center | 수직방향과 수평방향의 중앙 |
| fill | 수직방향과 수평방향으로 여유공간만큼 채우기 |
| clip_vertical | 상하 길이가 여유공간보다 클 경우에는 남는 부분을 잘라내기 |
| clip_horizontal | 좌유 길이가 여유공간보다 클 경우에는 남는 부분을 잘라내기 |


## 상대레이아웃 뷰 배치 속성

[코드](https://github.com/nickjw0205/android-practice/blob/master/SampleRelativeLayout/app/src/main/res/layout/activity_main.xml)

### 1. 부모 컨테이너와의 상대적 위치 이용 
| 속성 | 설명 |
| :-- | :-- |
| layout_alignParentTop | 부모컨테이너의 위쪽과 뷰의 위쪽을 맞춤 |
| layout_alignParentBottom | 부모 컨테이너의 아래쪽과 뷰의 아래쪽을 맞춤 |
| layout_alignParentLeft | 부모 컨테이너의 왼쪽과 뷰의 왼쪽을 맞춤 |
| layout_alignParentRight | 부모 컨테이너의 오른족과 뷰의 오른쪽을 맞춤 |
| layout_centerHorizontal | 부모 컨테이너의 수평 방향 중앙에 배치함 |
| layout_centerVertical | 부모 컨테이너의 수직 방향 중앙에 배치함 |
| layout_centerParent | 부모 컨테이너의 수평과 수직 방향에 배치함 |
    
### 2. 부모 컨테이너가 아닌 다른 뷰와의 상대적 위치를 이용
| 속성 | 설명 |
| :-- | :-- |
| layout_above | 지정한 뷰의 위쪽에 위치함 |
| layout_below | 지정한 뷰의 아래쪽에 위치함 |
| layout_toLeftOf | 지정한 뷰의 왼쪽에 위치함 |
| layout_toRightOf | 지정한 뷰의 오른쪽에 위치함 |
| layout_alignTop | 지정한 뷰의 위쪽과 맞춤 |
| layout_alignBottom | 지정한 뷰의 아래쪽과 맞춤 |
| layout_alignLeft | 지정한 뷰의 왼쪽과 맞춤 |
| layout_alignRight | 지정한 뷰의 오른쪽과 맞춤 |
| layout_alignBaseline | 지정한 뷰의 내용물의 아래쪽 기준선을 맞춤 |

## 테이블 레이아웃

| shrinkColumns | 부모 컨테이너의 폭에 맞게 강제 축소 |
| :-- | :-- |
| stretchColumns | 부모 컨테이너의 여유 공간을 모두 채우기 위해 각 열의 폭을 강제 확장 |

## 기본 위젯
------

### 1. text

~~~java
    <TextView
            android:id="@+id/Textview"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:background="#88aabbff"
            android:padding="4dp"
            android:text="여기에 사용자 이름을 입력하세요."
            android:textSize="22dp"
            android:textStyle="bold"
            android:textColor="#ffff8888"
            android:maxLines="1"
            android:gravity="center"
            />
~~~


####  * textColor
-----

| Alpha 값 | 결과 |
| :-- | :-- |
| "FF" | 불투명 |
| "00" | 투명 |
| "88" | 반투명 |

#### * textSize
------
| 문자열 크기 | 사이즈 |
| :-- | :-- |
| "dp" | 40dp |
| "sp" | 40sp |
| "px" | 40px |

#### * textStyle 
-------

| 문자열 스타일 | 결과 |
| :-- | :-- |
| "normal" | 기본 |
| "bold" | 굵게 |
| "italic" | 기울임 |
| "bolditalic" | 굵고 기울임 |

#### * typeFace 
--------

| 문자열 폰트 |
| :-- |
| "normal" |
| "sans" |
| "serif" |
| "monospace" |

#### * maxLines
------------

    텍스트 뷰에서 표시하는 문자열의 최대 줄 수








