import java.time.LocalDate;

public class Chapter10 {
	public static void main(String[] args) throws Exception {
		// Taskオブジェクトをリストに追加
		java.util.List<Task> list = new java.util.ArrayList<>();
		list.add(new Task(LocalDate.of(2021, 10, 21), "牛乳を買う", true));
		list.add(new Task(LocalDate.of(2021, 9, 15), "○○社面接", false));
		list.add(new Task(LocalDate.of(2021, 12, 4), "手帳を買う", true));
		list.add(new Task(LocalDate.of(2021, 8, 10), "散髪に行く", false));
		list.add(new Task(LocalDate.of(2021, 11, 9), "スクールの課題を解く", false));

		// 未完了のタスクをカウント
		long incompleteCount = list.stream().filter(task -> !task.isDone()) // 未完了のタスクをフィルタ
				.count();
		System.out.println("未完了のタスクの個数は" + incompleteCount);

		// 未完了のタスクを日時の昇順に並び替えて表示
		System.out.println("【未完了のタスクを昇順に並び替えて一覧表示】");
		list.stream().filter(task -> !task.isDone()) // 未完了のタスクをフィルタ
				.sorted() // 日付順にソート
				.forEach(System.out::println); // タスクを順に表示
	}
}
