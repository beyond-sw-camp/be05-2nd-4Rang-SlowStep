<div align="center">
<img src="https://github.com/beyond-sw-camp/be05-2nd-4Rang-SlowStep/assets/137466623/323f40b0-4830-4c0a-b5f7-9478e0068db7" width="850" height="650">
</div>
<br/>
<br/>
<br/>

## 목차 📄
  [1. 프로젝트 소개](#1-프로젝트-소개)<br>
  [2. 팀원 소개](#2-팀원-소개)<br>
  [3. 사용 기술](#3-사용-기술)<br>
  [4. 요구사항 명세서](#4-요구사항-명세서)<br>
  [5. 기능 명세서](#5-기능-명세서)<br>
  [6. 아키텍쳐](#6-아키텍처)<br>
  [7. DB설계와 DB명세서](#7-db설계와-db명세서)<br>
  [8. API 명세서](#8-api-명세서)<br>
  [9. 테스트](#9-테스트)<br>
  [10. 회고](#10-회고)<br>

  <br/>

## 1. 프로젝트 소개
🩺 SlowStep은 의료 서비스 분야에서 사용되는 웹 기반 플랫폼으로, 대학병원 의사와 요양병원 간호사를 대상으로 합니다. 이 플랫폼은 의료 기관 내에서 환자 정보를 관리하고 의료 서비스를 제공하는 데 필요한 다양한 기능을 제공합니다. 
대학병원 의사들과 요양병원 간호사들 SlowStep을 통해 환자의 건강 상태를 모니터링하며 서로 소통하고 환자 치료에 필요한 정보에 빠르게 접근할 수 있습니다. <br>

### 📢 주요 기능 및 특징  <br/>
1️⃣ **로그인 및 사용자 인증**: 사용자는 자체 계정으로 로그인하여 플랫폼에 액세스할 수 있습니다. 비밀번호 암호화 및 사용자 인증 기능을 통해 보안을 강화합니다.
<br/>
2️⃣ **의사 및 간호사 구분**: 플랫폼은 의사와 간호사를 구분하여 각각의 역할에 맞는 서비스를 제공합니다. 의사는 환자 진료 및 처방 기능을 사용할 수 있고, 간호사는 환자 간호 및 관리를 위한 기능을 사용할 수 있습니다.
<br/>
3️⃣ **환자 정보 관리**: 의료 전문가들은 환자의 기본 정보, 진단 내역, 처방약 및 투약 정보 등을 관리할 수 있습니다.
<br/>
4️⃣ **실시간 모니터링**: 플랫폼은 의료 전문가들이 환자의 상태를 실시간으로 모니터링할 수 있는 기능을 제공합니다. 이를 통해 환자의 상태 변화에 대한 신속한 대응이 가능합니다.
<br/>
5️⃣ **의사와 간호사간 쪽지**: 의사와 간호사는 환자 관리를 위해 서로 1:1관계로 쪽지를 주고 받을 수 있으며 이를 통해 환자의 상태 변화에 관한 신속한 전달이 가능하며 후에 따른 대응도 가능합니다.
<br/>
<br/>

### 💊 기대 효과 및 가치
✅ **의료 서비스 효율성 향상**: SlowStep은 의사와 간호사가 환자 정보에 쉽게 접근하고 업무를 효율적으로 수행할 수 있도록 돕습니다. 이를 통해 진료 시간을 단축하고 의료 서비스의 효율성을 높일 수 있습니다.
<br/>
✅ **환자 치료의 신속한 의사 결정**: SlowStep의 실시간 모니터링 기능은 의료 전문가들이 환자의 상태를 실시간으로 확인하고 즉각적으로 의사 결정을 내릴 수 있도록 지원합니다. 이는 환자의 치료에 필요한 빠른 대응을 가능케 하며, 치료 성공률을 높일 수 있습니다.
<br/>
✅ **환자 만족도 향상**: SlowStep을 통해 의료 서비스가 더욱 효율적으로 제공되고 의료진과의 원활한 소통이 이루어집니다. 이는 환자들의 만족도를 높이고 의료 기관의 평판을 향상시킵니다. 또한, 환자들이 진료 및 간호 서비스에 대한 신뢰를 가질 수 있도록 돕습니다.
<br/>
✅ **의료 비용 절감**: SlowStep을 통해 의료 서비스가 보다 효율적으로 운영되고 환자 치료에 필요한 정보가 신속하게 제공됩니다. 이는 불필요한 병원 재입원 및 재진료를 줄이고, 의료 비용을 절감하는 데 도움이 됩니다. 또한, 의료 리소스의 효율적인 활용으로 비용을 절감할 수 있습니다.
<br/>
✅ **혁신적인 의료 서비스 제공**: SlowStep은 의료 서비스 분야에서의 혁신적인 솔루션으로, 의료 전문가들의 업무를 간편하게 처리하고 환자 치료에 필요한 정보를 효율적으로 관리할 수 있도록 지원합니다. 이는 의료 기관의 경쟁력을 향상시키고 새로운 의료 서비스 모델의 발전에 기여합니다.
<br/>

<br/>

## 2. 팀원 소개
|<img src="https://github.com/beyond-sw-camp/be05-2nd-4Rang-SlowStep/assets/137466623/79ecba6a-96ea-4711-a641-90d7a171d415" width="150" height="150"/>|<img src="https://github.com/beyond-sw-camp/be05-2nd-4Rang-SlowStep/assets/137466623/bed37d0a-ab59-47d8-921a-8f2c3aa34ca9" width="150" height="150"/>|<img src="https://github.com/beyond-sw-camp/be05-2nd-4Rang-SlowStep/assets/137466623/facd74e6-cf7a-4803-99b3-bcd3436ad833" width="150" height="150"/>|<img src="https://github.com/beyond-sw-camp/be05-2nd-4Rang-SlowStep/assets/137466623/6fd97fbe-b661-4163-8423-c468c0bbb175" width="150" height="150"/>|<img src="https://github.com/beyond-sw-camp/be05-2nd-4Rang-SlowStep/assets/137466623/613004ee-fe1a-42f3-8976-bc37feab3526" width="150" height="150"/>|
|:-:|:-:|:-:|:-:|:-:|
|근엽🤔<br/>[@WARDKEY](https://github.com/WARDKEY)|설화😘<br/>[@Noononda](https://github.com/Noononda)|혜경😲<br/>[@BakHyegyeong](https://github.com/BakHyegyeong)|황엽😎<br/>[@jeonghwangyeop](https://github.com/jeonghwangyeop)|광수😄<br/>[@Jrhkdtn](https://github.com/Jrhkdtn)|
<br/>
<div>
  근엽🤔 : 요구사항 명세서 작성, 환자관리 기능 구현
</div>
<div>
  설화😘 : 화면 설계 및 기능 명세서 작성, 쪽지 기능 구현
</div>
<div>
  혜경😲 : 인터랙티브 아키텍쳐 작성, 환자관리 기능 구현
</div>
<div>
  황엽😎 : DB설계, 표준 정의, 쪽지 기능 구현
</div>
<div>
  광수😄 : 인터랙티브 아키텍쳐 작성, 사용자 기능 구현
</div>
<br/>

## 3. 사용 기술
<div align="center">
  <img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white">
  <img src="https://img.shields.io/badge/mariadb-003545?style=for-the-badge&logo=mariadb&logoColor=white">
</div>

<div align="center">
  <img src="https://img.shields.io/badge/springboot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white">
  <img src="https://img.shields.io/badge/springdatajpa-6DB33F?style=for-the-badge&logo=springboot&logoColor=white">
  <img src="https://img.shields.io/badge/mybatis-000000?style=for-the-badge&logo=mybatis&logoColor=white">
</div>

<div align="center">
  <img src="https://img.shields.io/badge/figma-F24E1E?style=for-the-badge&logo=figma&logoColor=white">
  <img src="https://img.shields.io/badge/adobeXd-FF61F6?style=for-the-badge&logo=adobexd&logoColor=white">
</div>

<div align="center">
  <img src="https://img.shields.io/badge/postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white">
  <img src="https://img.shields.io/badge/swagger-85EA2D?style=for-the-badge&logo=swagger&logoColor=white">
  <img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white">
  <img src="https://img.shields.io/badge/slack-4A154B?style=for-the-badge&logo=slack&logoColor=white">
</div>
<br/>

## 4. 요구사항 명세서

<details>
<summary>요구사항 명세서</summary>
  <img src="https://github.com/beyond-sw-camp/be05-2nd-4Rang-SlowStep/assets/132131921/7f4d3e6e-1c13-4400-a74c-a52ca455b0a2" alt="요구사항 명세서" style='border-radius: 100px;'>

</details>





## 5. 기능 명세서

  [기능명세서](https://docs.google.com/viewer?url=https://github.com/beyond-sw-camp/be05-2nd-4Rang-SlowStep/files/14768307/03.27.11.09.pdf)


## 6. 아키텍처
<details>
<summary>ERD</summary>
  <img src="https://github.com/beyond-sw-camp/be05-2nd-4Rang-SlowStep/assets/156383201/16238c24-7593-4697-b41d-9f9c8be5f678" alt="환자 정보 조회" style='border-radius: 100px;'>
</details>
<details>
<summary>클래스 다이어그램</summary>
  <img src="https://github.com/beyond-sw-camp/be05-2nd-4Rang-SlowStep/assets/156383201/e988629d-e6c3-42bd-b9d5-cad21bf9f1a6" alt="환자 정보 조회" style='border-radius: 100px;'>
</details>

## 7. DB설계와 DB명세서
<details> 
<summary>DB설계서</summary>
  <img src="https://github.com/beyond-sw-camp/be05-2nd-4Rang-SlowStep/assets/156383201/eb5d3a27-eebe-4f0b-9da1-6dc551610206" alt="환자 정보 조회" style='border-radius: 100px;'>
  <img src="https://github.com/beyond-sw-camp/be05-2nd-4Rang-SlowStep/assets/156383201/cc1a8389-aebc-498b-9be2-87cc4c83b97b" alt="환자 정보 조회" style='border-radius: 100px;'>
</details>

<details>
<summary>표준제안</summary>
  <img src="https://github.com/beyond-sw-camp/be05-2nd-4Rang-SlowStep/assets/156383201/1b02edb9-2195-4037-9417-b8a0800105dd" alt="환자 정보 조회" style='border-radius: 100px;'>
</details>

## 8. API 명세서
<details>
<summary>API 명세서</summary>
  <img src="https://github.com/beyond-sw-camp/be05-2nd-4Rang-SlowStep/assets/132131921/66b6b912-41b7-40cf-b367-c4990942c02d" alt="API 명세서" style='border-radius: 50px;'>
</details>

## 9. 테스트
<details>
<summary>공동 환자관리</summary>
  <img src="https://github.com/beyond-sw-camp/be05-2nd-4Rang-SlowStep/assets/132131921/55c33e81-b778-45c6-bd18-711e8dafa889" alt="환자 정보 조회" style='border-radius: 100px;'>
  <br>
  <img src="https://github.com/beyond-sw-camp/be05-2nd-4Rang-SlowStep/assets/132131921/2708c268-c914-4a29-a2e0-41678a8fc3be" alt="복용 약물 조회" style='border-radius: 100px;'>
  <br>
  <img src="https://github.com/beyond-sw-camp/be05-2nd-4Rang-SlowStep/assets/132131921/fc4876a3-cd20-4a2b-a6a4-f054e695ffac" alt="환자 건강 정보 확인" style='border-radius: 100px;'>

  <br>
  <img src="https://github.com/beyond-sw-camp/be05-2nd-4Rang-SlowStep/assets/132131921/becad26a-3582-4cbf-943c-0c30a0f3f317" alt="환자 진료 차트 확인" style='border-radius: 100px;'>

  <br>
  <img src="https://github.com/beyond-sw-camp/be05-2nd-4Rang-SlowStep/assets/132131921/e61c8840-a4cc-4c9d-9356-260057acffcd" alt="환자 진료 정보 확인" style='border-radius: 100px;'>

  <br>
  <img src="https://github.com/beyond-sw-camp/be05-2nd-4Rang-SlowStep/assets/132131921/2f795fa0-f173-429f-b50f-f64fedd83f2a" alt="환자 질병 이력 조회" style='border-radius: 100px;'>
  


  <br>
<img src="https://github.com/beyond-sw-camp/be05-2nd-4Rang-SlowStep/assets/132131921/7802fb07-55db-4403-866d-0f68f884f51f" alt="환자 건강 정보 등록" style='border-radius: 100px;'>


<img src="https://github.com/beyond-sw-camp/be05-2nd-4Rang-SlowStep/assets/83454423/4c7d6895-97fa-4561-802b-a72a722483fe" alt="" style='border-radius: 100px;'>
  
</details>


<details>
<summary>의사 환자관리</summary>
  <img src="https://github.com/beyond-sw-camp/be05-2nd-4Rang-SlowStep/assets/132131921/ef1e7130-1e6d-44bb-a72b-a97804587107" alt="진료 정보 조회" style='border-radius: 100px;'>
  <img src="https://github.com/beyond-sw-camp/be05-2nd-4Rang-SlowStep/assets/132131921/5ebdb3c8-ed50-4f23-a097-7c9afb5f308b" alt="진료 정보 등록" style='border-radius: 100px;'>
  <img src="" alt="" style='border-radius: 100px;'>
  
</details>

<details>
<summary>간호사 환자관리</summary>
  <img src="https://github.com/beyond-sw-camp/be05-2nd-4Rang-SlowStep/assets/132131921/8fc8f8bb-0006-40dc-bc7a-3158a349c948" alt="진료 담당의 확인" style='border-radius: 100px;'>


</details>

<details>
<summary>계정</summary>
  <img src="https://github.com/beyond-sw-camp/be05-2nd-4Rang-SlowStep/assets/114909535/8cb4e0b4-3367-420a-bd97-396a918a82c0" alt="진료 담당의 확인" style='border-radius: 100px;'>


  <img src="https://github.com/beyond-sw-camp/be05-2nd-4Rang-SlowStep/assets/114909535/eb81f391-730b-47ea-a190-68a95c19e6a6" alt="진료 담당의 확인" style='border-radius: 100px;'>


  <img src="https://github.com/beyond-sw-camp/be05-2nd-4Rang-SlowStep/assets/114909535/f87545de-1989-4700-9932-03d70ef89484" alt="진료 담당의 확인" style='border-radius: 100px;'>
</details>

<details>
<summary>쪽지</summary>
  <img src="https://github.com/beyond-sw-camp/be05-2nd-4Rang-SlowStep/assets/132131921/5541f566-abff-40d8-b118-447fff42a4a9" alt="간호사 목록" style='border-radius: 50px;'>

  <img src="https://github.com/beyond-sw-camp/be05-2nd-4Rang-SlowStep/assets/132131921/8b160d7a-fd59-42d5-b42b-478f3aba10cb" alt="의사 목록" style='border-radius: 50px;'>

  <img src="https://github.com/beyond-sw-camp/be05-2nd-4Rang-SlowStep/assets/132131921/8d83df66-579f-4c52-8a5b-97e2fc8d04ac" alt="쪽지 내역 열람1" style='border-radius: 50px;'>

  <img src="https://github.com/beyond-sw-camp/be05-2nd-4Rang-SlowStep/assets/132131921/6ca718b2-64d5-4bb8-9561-7b31aa34b4af" alt="쪽지 내역 열람2" style='border-radius: 50px;'>

  <img src="https://github.com/beyond-sw-camp/be05-2nd-4Rang-SlowStep/assets/132131921/03c30534-419b-41e2-9f24-b794228a0f2f" alt="쪽지 삭제" style='border-radius: 50px;'>

  <img src="https://github.com/beyond-sw-camp/be05-2nd-4Rang-SlowStep/assets/132131921/6cf64b72-8096-49c7-9f04-23b108585979" alt="쪽지 세부 내역(상대가 보낸 쪽지 열람시)" style='border-radius: 50px;'>

  <img src="https://github.com/beyond-sw-camp/be05-2nd-4Rang-SlowStep/assets/132131921/f3aa8862-cb08-443c-bce4-e95e18b86c32" alt="쪽지 세부 내역(상대가 보낸 쪽지 열람 결과)" style='border-radius: 50px;'>

  <img src="https://github.com/beyond-sw-camp/be05-2nd-4Rang-SlowStep/assets/132131921/d7129751-a0da-4f71-b18a-7aa611719425" alt="쪽지 세부 내역(자신이 보낸 쪽지 열람 시)" style='border-radius: 50px;'>

  <img src="https://github.com/beyond-sw-camp/be05-2nd-4Rang-SlowStep/assets/132131921/826ea93b-cf90-4f88-a6e2-0217e35eed7d" alt="쪽지 세부 내역(자신이 보낸 쪽지 열람 결과)" style='border-radius: 50px;'>

  <img src="https://github.com/beyond-sw-camp/be05-2nd-4Rang-SlowStep/assets/132131921/fd4ef4fd-9a98-40b8-a851-0458b947f65e" alt="쪽지 세부 내용 열람(삭제된 쪽지)" style='border-radius: 50px;'>


  <img src="https://github.com/beyond-sw-camp/be05-2nd-4Rang-SlowStep/assets/132131921/1dd93fb3-e70c-4e34-9892-97c2c82c90a8" alt="쪽지 작성" style='border-radius: 50px;'>


  <img src="https://github.com/beyond-sw-camp/be05-2nd-4Rang-SlowStep/assets/132131921/21a713f3-63a2-41f6-a438-fa1e92ba5e13" alt="쪽지 작성(결과)" style='border-radius: 50px;'>


</details>


## 10. 회고
<details>
  <summary>황엽😎</summary>
  <img src="https://github.com/beyond-sw-camp/be05-2nd-4Rang-SlowStep/assets/137466623/e7c1d274-27e9-42b4-bb9b-ff1e795dedf8">
</details>

<details>
  <summary>근엽🤔</summary>
  <img src="https://github.com/beyond-sw-camp/be05-2nd-4Rang-SlowStep/assets/137466623/87612f00-4144-4113-bfcc-394db355715d">
</details>

<details>
  <summary>혜경😲</summary>
  <img src="https://github.com/beyond-sw-camp/be05-2nd-4Rang-SlowStep/assets/137466623/c3c84100-3053-444c-ac3d-8f56b947ee77">
</details>

<details>
  <summary>광수😄</summary>
  <img src="https://github.com/beyond-sw-camp/be05-2nd-4Rang-SlowStep/assets/137466623/7a51e865-a9b7-4685-acfc-65bc983e42f5">
</details>

<details>
  <summary>설화😘</summary>
<img src="https://github.com/beyond-sw-camp/be05-2nd-4Rang-SlowStep/assets/137466623/a00f899e-8582-4cee-b0d7-dfc6751a7b50">
</details>




<img src="https://capsule-render.vercel.app/api?type=waving&color=75bdc2&height=120&section=footer&fontSize=50&fontColor=13334b" width="1100" />
