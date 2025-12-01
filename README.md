# Демопроект по автоматизации тестирования сайта Cyberpunk 2077
## :page_with_curl: Содержание:
- [Стек технологий](#dvd-стек-технологий)
- [Реализованные проверки](#mag-реализованные-проверки)
- [Запуск автотестов](#crystal_ball-запуск-автотестов)
- [Сборка Jenkins](#oncoming_automobile-сборка-jenkins)
- [Отчет Allure](#bar_chart-отчет-allure)
- [Уведомление в Telegram](#bell-уведомление-в-telegram)
- [Запуск в ТестОпс](#blue_book-запуск-в-тестопс)
- [Задача в Jira](#information_source-задача-в-jira)
- [Видео примера запуска тестов в Selenoid](#movie_camera-видео-примера-запуска-тестов-в-selenoid)
---
## :dvd: Стек технологий
<p align="center">
<a href="https://github.com/"><img width="6%" title="GitHub" src="media/logo/GitHub.svg">
<a href="https://www.jetbrains.com/idea/"><img width="6%" title="IntelliJ IDEA" src="media/logo/Intelij_IDEA.svg">
<a href="https://www.java.com/"><img width="6%" title="Java" src="media/logo/Java.svg">
<a href="https://gradle.org/"><img width="6%" title="Gradle" src="media/logo/Gradle.svg">
<a href="https://junit.org/junit5/"><img width="6%" title="JUnit5" src="media/logo/JUnit5.svg">
<a href="https://selenide.org/"><img width="6%" title="Selenide" src="media/logo/Selenide.svg">
<a href="https://www.jenkins.io/"><<img width="6%" title="Jenkins" src="media/logo/Jenkins.svg">
<a href="https://aerokube.com/selenoid/"><img width="6%" title="Selenoid" src="media/logo/Selenoid.svg">
<a href="https://allurereport.org/"><img width="6%" title="Allure Report" src="media/logo/Allure_Report.svg">
<a href="https://web.telegram.org/"><img width="6%" title="Telegram" src="media/logo/Telegram.svg">
<a href="https://qameta.io"><img width="6%" title="TestOps" src="media/logo/TespOps.ico">
<a href="https://www.atlassian.com/software/jira"><img width="6%" title="jira" src="media/logo/Jira.svg">
</p>

---
## :mag: Реализованные проверки
- Проверка компонентов на главной странице сайта Cyberpunk 2077:
  - Текст "Полное погружение в Cyberpunk 2077" и кнопки "Купить" и "Трейлер"
  - Разделы меню
  - Наполнение разделов в меню
<p align="center">
<img width="50%" title="what" src="media/screenshot/чтопроверяем.png">
</p>

---
## :crystal_ball: Запуск автотестов (с учетом дз 17 Owner)
Локальный запуск:
```bash
./gradlew clean ${TAG} -Denv=local
```
Запуск на удаленном браузере:
```bash
./gradlew clean ${TAG} -Denv=remote
```
```bash
./gradlew clean
${TAG}
-DremoteUrl=${SELENOID_URL}
-Dbrowser=${BROWSER}
-DbrowserVersion=${BROWSER_VERSION}
-DbrowserResolution=${BROWSER_RESOLUTION}
```
где параметры:
- `${TAG}` - какой табор тестов будет запущен
  - test - все тесты проекта
  - smoke - самые критичные кейсы
- `${SELENOID_URL}` - урл селенойда
- `${BROWSER}` и `${BROWSER_VERSION}` - на каком браузере и какой версии запускать
  - chrome
    - 127.0
    - 128.0
  - firefox
    - 124.0
    - 125.0
- `${BROWSER_RESOLUTION}` - разрешение браузера
  - 1920x1080
  - 1366x768
  - 2560x1440

---
## :oncoming_automobile: Сборка Jenkins
Ссылка: [037-attanosolas-cyberpunk2077](https://jenkins.autotests.cloud/job/037-attanosolas-cyberpunk2077/)
<p align="center">
<img width="50%" title="jenkins" src="media/screenshot/jenkins.png">
</p>

---
## :bar_chart: Отчет Allure
Ссылка: [037-attanosolas-cyberpunk2077/allure/](https://jenkins.autotests.cloud/job/037-attanosolas-cyberpunk2077/1/allure/)  
Главная страница отчета
<p align="center">
<img width="50%" title="allureRMain" src="media/screenshot/allureRMain.png">
</p>
Пример теста в отчете
<p align="center">
<img width="50%" title="allureRCase" src="media/screenshot/allureRCase.png">
</p>

---
## :bell: Уведомление в Telegram
<p align="center">
<img width="20%" title="tg" src="media/screenshot/tg.png">
</p>

---
## :blue_book: Запуск в ТестОпс
Ссылка: [037-attanosolas-cyberpunk2077](https://allure.autotests.cloud/project/5026/test-cases?treeId=0)
<p align="center">
<img width="50%" title="testops" src="media/screenshot/testops.png">
</p>

---
## :information_source: Задача в Jira
Ссылка: [jira](https://jira)
<p align="center">
<img width="50%" title="jira" src="media/screenshot/jira.png">
</p>

---
## :movie_camera: Видео примера запуска тестов в Selenoid
К каждому тесту в отчете прилагается видео прогона
<p align="center">
<img width="50%" title="Video" src="media/screenshot/cp2077.gif">
</p>
