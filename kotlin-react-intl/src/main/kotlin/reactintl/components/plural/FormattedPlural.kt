@file:JsModule("react-intl")
@file:JsNonModule

package reactintl.components.plural

import react.*
import reactintl.*

@JsName("FormattedPlural")
external class FormattedPluralComponent : Component<FormattedPluralProps, State> {
    override fun render(): ReactElement?
}

external interface FormattedPluralProps : FormatPluralOptions, Props {
    var value: Number
    var intl: IntlShape
    var other: ReactNode
    var zero: ReactNode?
    var one: ReactNode?
    var two: ReactNode?
    var few: ReactNode?
    var many: ReactNode?
    var children: ((value: ReactNode?) -> ReactElement?)?
}

external object IntlPlural {
    interface PluralRulesOptions {
        var localeMatcher: String? /* "lookup" | "best fit" */
        var type: IntlPluralRuleType?
        var minimumIntegerDigits: Number?
        var minimumFractionDigits: Number?
        var maximumFractionDigits: Number?
        var minimumSignificantDigits: Number?
        var maximumSignificantDigits: Number?
    }

    interface ResolvedPluralRulesOptions {
        var locale: String
        var pluralCategories: Array<IntlLDMLPluralRule>
        var type: IntlPluralRuleType
        var minimumIntegerDigits: Number
        var minimumFractionDigits: Number
        var maximumFractionDigits: Number
        var minimumSignificantDigits: Number?
        var maximumSignificantDigits: Number?
    }

    interface PluralRules {
        fun resolvedOptions(): ResolvedPluralRulesOptions
        fun select(n: Number): IntlLDMLPluralRule
    }
}
