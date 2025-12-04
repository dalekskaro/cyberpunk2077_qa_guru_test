# Демопроект по автоматизации тестирования сайта Cyberpunk 2077
<p align="center">
<a href="https://www.cyberpunk.net/ru/ru/"><img width="30%" title="GitHub" src="media/logo/Cyberpunk_2077_logo.svg.png">
</p>

## :page_with_curl: Содержание:
- [Стек технологий](#dvd-стек-технологий)
- [Реализованные проверки](#mag-реализованные-проверки)
- [Запуск автотестов](#crystal_ball-запуск-автотестов)
- [Сборка Jenkins](#oncoming_automobile-сборка-jenkins--037-attanosolas-cyberpunk2077)
- [Отчет Allure](#bar_chart-отчет-allure)
- [TMS ТестОпс](#blue_book-tms-тестопс)
- [Задача в Jira](#information_source-задача-в-jira-homework-1550)
- [Уведомление в Telegram](#bell-уведомление-в-telegram)
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
  <a href="https://aerokube.com/selenoid/latest/"><img width="6%" title="Selenide" src="media/logo/Selenoid.svg">
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
## :crystal_ball: Запуск автотестов
**Локальный запуск:**
```bash
./gradlew clean ${TAG} -Denv=local
```
**Запуск на удаленном браузере:**
```bash
./gradlew clean ${TAG} -Denv=remote -DremoteUrl=${SELENOID_URL} -Dbrowser=${BROWSER} -DbrowserVersion=${BROWSER_VERSION} -DbrowserResolution=${BROWSER_RESOLUTION}
```
где параметры:
- `${TAG}` - какой табор тестов будет запущен
  - test - все тесты проекта (ранее, был тег regress, но он был навешен на все тесты, поэтому было принято решение убрать данный тег)
  - smoke - самые критичные кейсы
- `${SELENOID_URL}` - урл селенойда с логином и паролем
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

**Сгенерировать отчет:**
```bash
allure serve build/allure-results
```

---
## :oncoming_automobile: [Сборка Jenkins '037-attanosolas-cyberpunk2077'](https://jenkins.autotests.cloud/job/037-attanosolas-cyberpunk2077/)
<p align="center">
<img width="50%" title="jenkins" src="media/screenshot/jenkins.png">
</p>

---
## :bar_chart: [Отчет Allure](https://jenkins.autotests.cloud/job/037-attanosolas-cyberpunk2077/1/allure/)
Главная страница отчета
<p align="center">
<img width="50%" title="allureRMain" src="media/screenshot/allureRMain.png">
</p>
Пример теста в отчете
<p align="center">
<img width="50%" title="allureRCase" src="media/screenshot/allureRCase.png">
</p>

---
## :blue_book: [TMS ТестОпс](https://allure.autotests.cloud/project/5026/test-cases?treeId=0)
Тест-кейс в запуске
<p align="center">
<img width="50%" title="testops" src="media/screenshot/testops-launch.png">
</p>
Общий дашборд проекта
<p align="center">
<img width="50%" title="testops" src="media/screenshot/testops-dashboard.png">
</p>

---
## :information_source: [Задача в Jira HOMEWORK-1550](https://jira.autotests.cloud/browse/HOMEWORK-1550)
<p align="center">
<img width="50%" title="jira" src="media/screenshot/jira.png">
</p>

---
## :bell: Уведомление в Telegram
<p align="center">
<img width="20%" title="tg" src="media/screenshot/tg.png">
</p>

---
## :movie_camera: Видео примера запуска тестов в Selenoid
К каждому тесту в отчете прилагается видео прогона
<p align="center">
<img width="50%" title="Video" src="media/screenshot/cp2077.gif">
</p>
