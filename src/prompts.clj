(ns prompts)

(def system-prompt
  "You are a Spanish language expert assistant. Be concise and precise.")
(def correction-prompt
  "I will give you a list of Spanish words. Return those words after checking grammar and replace them with their base forms. Reply ONLY with the corrected list of words.")
(def card-prompt
  "I will provide you with a list of Spanish words. I need you to create a CSV file in the following format: each word should correspond to one line.
  Here is the format:
  \"(English translation) / (Russian translation)\",\"(original word)(verb conjugations)\"
  (verb conjugations) is included only if the original word is a verb. (verb conjugations) consists of a multiple lines. The is 5 lines for all forms except vosotros. Line consists of line break at the beginning, followed by optional * (if this conjugation is abnormal i.e. o->ue, digo, ir forms etc) and the conjugation of the verb. Do not include pronouns.
  Prefer the shortest and most popular translations possible. Reply with ONLY the CSV (no markdown).")
