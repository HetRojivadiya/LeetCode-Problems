SELECT Students.student_id, Students.student_name, Subjects.subject_name, IFNULL(cnt, 0) as attended_exams
FROM Students
CROSS JOIN Subjects
LEFT JOIN (
    SELECT student_id, subject_name, COUNT(*) as cnt FROM Examinations GROUP BY student_id, subject_name
) as Temp ON Subjects.subject_name = Temp.subject_name AND Students.student_id = Temp.student_id
ORDER BY student_id, subject_name