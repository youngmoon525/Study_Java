# 과제 피드백

김민주 & 민세희 & 장광희

- 수정 사항
    - 스캐너 부분은 이미 1세대에서 준비가 되어 있기 때문에 1세대에서 초기화를 시켜두고 2~3세대는 그냥 이용만 하면 편함.
    
    ```java
    **public Scanner sc = new Scanner(System.in);**
    ```
    
    - 기능 구현 중 대소문자 구분은 String.upper(); 또는 String.lower()를 이용하여 전체를 대문자 또는 소문자로 바꾸고 사용.
    
    ```java
    dto.button.equals("off") || dto.button.equals("OFF")
    ```
    
    - 변수명 의미 있는 단어 사용
    
    ```java
    public int onf; 
    	int opt;
    ```
    
- 전체적으로 super에 구현 되어 있는 메소드 재사용 부분이 부족함.( 상속의 장점을 못 살림)

외에는 대부분 잘 구현이 되신 것 같습니다… 고생하셨습니다.