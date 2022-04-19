# Викторина

Приложение, в котором пользователь может создавать викторины, проходить викторины других участников, полученных при помощи добавления кода викторины.

## Коды для примера работы
xmFlQCO8ywnnCVKZgCC7

## Требования

Устройство с Google сервисами для авторизации в приложении.

## Функции реализованные для mvp-проекта
- Авторизация в системе, выход из системы;
- Прохождение теста;
- Таймер в вопросах;
- Формирование результата прохождения викторины;
- Навигация по приложению;
- Добавление викторины по полученному коду от другого участника.

## Функции для улучшения проекта
- Создание викторины в приложении;
- Создание вопроса в приложении;
- Загрузка картинки к викторине;
- Удалить викторину;
- Поделиться викториной;
- Реализация темной темы;
- Локализация.

## Скриншоты демонстрации работы приложения

| Авторизация в приложении | Аккаунт пользователя |
|---|---|
| ![Авторизация в приложении](./docs/app/screenshots/app_start.png) | ![Аккаунт пользователя](./docs/app/screenshots/account.png) |

| Домашняя страница с доступными викторинами | Поле для ввода кода викторины |
|---|---|
| ![Домашняя страница с доступными викторинами](./docs/app/screenshots/home.png) | ![Поле для ввода кода викторины](./docs/app/screenshots/join_quiz_field.png) |

| Меню для открытия поля добавления викторины | Детали викторины |
|---|---|
| ![Меню для открытия поля добавления викторины](./docs/app/screenshots/join_quiz_menu.png) | ![Детали викторины ](./docs/app/screenshots/test_detail.png) |

| Случай, когда дан верный ответ | Случай, когда дан неверный ответ  | Результаты  |
|---|---|---|
| ![Случай, когда дан верный ответ](./docs/app/screenshots/test_question_right_answer.png) | ![Случай, когда дан неверный ответ](./docs/app/screenshots/test_question_right_answer.png) | ![Результаты](./docs/app/screenshots/test_result.png) |


## Конифигурирование проекта
Для демонстрации работы приложения просто склонируйте репозиторий и запустите проект в Android Studio.

Если Вы хотите использовать приложение в своем проекте, то вам необходимо зарегистрировать приложение в Firebase, подключить аутентификацию Google, сгенерировать ключ и добавить его в поле при создании файла google-services.json.
Настройка Firebase Database представлена в директории /docs/firebase/screenshots.

## Автор

Магеррамов Борис, 2021-2022