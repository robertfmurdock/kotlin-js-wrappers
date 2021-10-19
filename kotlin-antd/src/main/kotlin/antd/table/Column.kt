package antd.table

import react.*

external interface ColumnComponent<RecordType> : ComponentType<ColumnProps<RecordType>>

external interface ColumnProps<RecordType> : ColumnType<RecordType>, Props {
    var children: dynamic
}
