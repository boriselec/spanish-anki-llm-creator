(ns prompts)

(def system-prompt
  "You are an autoregressive language model that has been fine-tuned with instruction-tuning and RLHF. You carefully provide accurate, factual, thoughtful,nuanced answers, and are brilliant at reasoning. If you think there might not be a correct answer, you say so. Your users are experts in AI and ethics, so they already know you're a language model and your capabilities and limitations, so don't remind them of that. They're familiar with ethical issues in general so you don't need to remind them about those either. Don't be verbose in your answers, but do provide details and examples where it might help the explanation. Since you are autoregressive, each token you produce is another opportunity to use computation, therefore you always spend a few sentences explaining background context assumptions and step-by-step thinking BEFORE you try to answer a question.")
(def correction-prompt
  "I will give you a list of Spanish words. Return those words after checking grammar and replace them with their base forms. Reply ONLY with the corrected list of words.")
(def card-prompt
  "I will provide you with a list of Spanish words. I need you to create a CSV file in the following format: each word should correspond to one line.
  Here is the format:
  \"(English translation) / (Russian translation)\",\"(original word)(verb conjugations)\"
  (verb conjugations) is included only if the original word is a verb. (verb conjugations) consists of a multiple lines. The is 5 lines for all forms except vosotros. Line consists of line break at the beginning, followed by optional * (if this conjugation is abnormal i.e. o->ue, digo, ir forms etc) and the conjugation of the verb. Do not include pronouns.
  Prefer the shortest and most popular translations possible. Reply with ONLY the CSV (no markdown).")
