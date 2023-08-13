# S3File 업로드, 수정, 삭제
<img src = "https://github.com/kimjisoo1156/S3File/assets/121778107/2cd49aab-de56-449e-88c8-315d34b7b9ed" width="600" height="600"/>


## 프로젝트 설명


기존 capstone_1 개발 하면서 게시판에 이미지 업로드, 수정, 삭제 기능이 필요하여

Aws s3 bucket에 이미지 업로드, 수정, 삭제 기능 구현을 해보았습니다. 

capstone_1 프로젝트에 적용하기 앞서, 따로 해당 기술은 분리하였습니다.

따라서 배포 환경 설정은 capston_1 리포지토리에 있습니다.


## 프로젝트 기능 구현 설명

이미지 업로드를 하면, Aws S3 bucket에 사진이 올라갑니다.


이미지 수정을 하면, Aws s3 bucket에 수정된 사진이 올라갑니다.


이미지 삭제를 하면, Aws s3 bucket에 삭제됨을 확인할 수 있습니다.


파일이름은 UUID처리하여 중복된 파일이름이 DB에 저장되지 않도록 하였으며,


s3 bucket에 올라간 url주소 또한 DB에 저장되도록 구현하였습니다.

## 참고 사이트
https://victorydntmd.tistory.com/336 (화면 디자인 참고)

https://velog.io/@rainbowweb/AWS-스프링부트-S3 (S3Service에서 content type지정 참고)

## 💻 My Stack
<img src="https://img.shields.io/badge/spring-6DB33F?style=for-the-badge&logo=mysql&logoColor=white"> <img src="https://img.shields.io/badge/springboot-6DB33F?style=for-the-badge&logo=mysql&logoColor=white"> <img src="https://img.shields.io/badge/JAVA-007396?style=for-the-badge&logo=java&logoColor=white"> <img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white"> <img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white"> <img src="https://img.shields.io/badge/aws-232F3E?style=for-the-badge&logo=aws&logoColor=white"> <img src="https://img.shields.io/badge/html-E34F26?style=for-the-badge&logo=html5&logoColor=white"> <img src="https://img.shields.io/badge/thymeleaf-005F0F?style=for-the-badge&logo=html5&logoColor=white">

