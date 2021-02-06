class PriyankaChallenge:
    def reverse_words_in_sentence(sentence):
        # words = sentence.strip().split(" ")
        # result = ''
        # for word in words:
        #     result += ' ' + word[::-1]
        # return result #
        return ' '.join(sentence.strip().split()[::-1])


result = PriyankaChallenge.reverse_words_in_sentence("   Hello How are you")
print(result)
