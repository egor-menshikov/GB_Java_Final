package ui;

public class TextUI {
    protected String menuPrompt;
    protected String menuList;
    protected String hello;
    protected String goodbye;
    protected String promptName;
    protected String promptWeight;
    protected String addConfirm;
    protected String listEmpty;
    protected String promptWrongFormat;

    public TextUI() {
        this.hello = "Начало работы. Автомат игрушек.\n";
        this.menuPrompt = "Выберите пункт меню:";
        this.menuList = """
                1) Добавить игрушку в призовой пул.
                2) Вытянуть случайную игрушку в список на выдачу.
                3) Выдать первую игрушку из списка (запись в файл).
                4) Показать призовой пул.
                5) Показать очередь на выдачу.
                6) Выход.""";
        this.promptName = "Введите название игрушки:";
        this.promptWeight = "Введите вероятность (вес):";
        this.addConfirm = "Игрушка добавлена в призовой пул.";
        this.goodbye = "Завершение работы. До свидания.";
        this.listEmpty = "Этот список пока пуст.\n";
        this.promptWrongFormat = "Неверный формат ввода, попробуйте еще раз.";
    }
}
