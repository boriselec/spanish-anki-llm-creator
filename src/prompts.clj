(ns prompts)

(def system-prompt
  "You are a Spanish language expert assistant. Be concise and precise.")
(def correction-prompt
  "I will give you a list of Spanish words. Return those words after checking grammar and replace them with their base forms. Reply ONLY with the corrected list of words.")
(def card-prompt
  "I will provide you with a list of Spanish words. Produce one CSV row per word, in the same order as the input.
  Row format:
  \"(English translation) / (Russian translation)\",\"(original word)(verb conjugations)\"
  (verb conjugations) is included only for verbs:
  - 5 lines, one for each of: yo, tú, él/ella, nosotros, ellos (skip vosotros).
  - Each line is preceded by a line break, then optional * if the form is irregular (o->ue, digo, ir forms, etc.), then the conjugation. No pronouns.
  Prefer the shortest and most popular translations.
  Output raw CSV only. No code fences, no backticks, no prose before or after.")
